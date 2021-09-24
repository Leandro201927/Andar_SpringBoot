package com.example.andar.utils.sendemail;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
    String from, fromPassword, to, host;

    public SendMail (String from, String fromPassword, String to, String host) {
        this.from = from;
        this.to = to;
        this.host = host;
        this.fromPassword = fromPassword;
    }

    public Map<Boolean, String> sendSMTP() {
        Map<Boolean, String> result = new HashMap<Boolean, String>();
        // Get system properties
        Properties properties = System.getProperties();
        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, fromPassword);
            }
        });
        // Used to debug SMTP issues
        session.setDebug(true);
        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);
            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));
            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            // Set Subject: header field
            message.setSubject("Test message subject");
            // Now set the actual message
            message.setText("The message sent successfully.");
            // Send message
            Transport.send(message);
            //successful
            result.put(true, "Email sent successfully.");
            return result;
        } catch (MessagingException e) {
            result.put(false, e.toString());
            return result;
        }
    }
}
