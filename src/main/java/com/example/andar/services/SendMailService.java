package com.example.andar.services;

import java.util.Map;

import com.example.andar.models.SendMailModel;
import com.example.andar.utils.sendemail.SendMail;

import org.springframework.stereotype.Service;

@Service
public class SendMailService {
    public Map<Boolean, String> sendSMTP(SendMailModel mail) {
        return new SendMail(mail.getFrom(), mail.getFromPassword(), mail.getTo(), mail.getHost()).sendSMTP();
    }
}
