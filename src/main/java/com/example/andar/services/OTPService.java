package com.example.andar.services;

import java.util.Map;

//import com.example.andar.utils.sendemail.SESService;
import com.example.andar.utils.sendemail.SendMail;

import org.springframework.stereotype.Service;

@Service
public class OTPService {
    public Map<Boolean, String> sendMailOTP(String mail, int otp) {
        //4 digit otp
        System.out.println(mail);
        System.out.println(otp);
        String message = "¡Hola!, <br> tu código de verificación (OTP) es <strong>"+otp+"</strong>";
        return new SendMail.Builder()
            .setEmailDestination(mail)
            .withSubject("Test message subject!!")
            .withBodyMessage(message)
            .build()
            .sendSMTP();
        //return new SESService().sendSESService();
    }
}
