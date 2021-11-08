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


//Java 'Builder' design pattern class
public class SendMail {
    String from, fromPassword, to, host, subject, bodyMessage;
    private final String FROM = "andarsmtp@gmail.com";
    private final String FROM_PSW = "andar2021";

    private SendMail (Builder builder) {
        this.to = builder.to;
        this.subject = builder.subject;
        this.bodyMessage = builder.bodyMessage;
        //this.from = from;
        //this.host = host;
        //this.fromPassword = fromPassword;
    }

    public static class Builder {
        private String subject = "";
        private String bodyMessage = "";
        private String to = "";

        public Builder setEmailDestination(String to) {
            this.to = to;
            return this;
        }

        public Builder withSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder withBodyMessage(String bodyMessage) {
            this.bodyMessage = bodyMessage;
            return this;
        }

        public SendMail build() {
            return new SendMail(this);
        }
    }

    public Map<Boolean, String> sendSMTP() {
        Map<Boolean, String> result = new HashMap<Boolean, String>();
        // Get system properties
        Properties properties = System.getProperties();
        // Setup mail server
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(FROM, FROM_PSW);
            }
        });
        // Used to debug SMTP issues
        session.setDebug(true);
        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);
            // Set From: header field of the header.
            message.setFrom(new InternetAddress(FROM));
            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            // Set Subject: header field
            message.setSubject(subject);
            // Now set the actual message
            message.setText(bodyMessage);
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
