package com.example.andar.controllers;

import java.util.Map;

import com.example.andar.models.SendMailModel;
import com.example.andar.services.SendMailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import org.springframework.web.bind.annotation.RequestBody;

@RestControllerAdvice
@RequestMapping("/sendmail")
public class SendMailController {
    @Autowired
    SendMailService sendMailService;

    @PostMapping(
        consumes = {MediaType.APPLICATION_JSON_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE})
    public Map<Boolean, String> savePregunta(@RequestBody SendMailModel mailModel) {
        return this.sendMailService.sendSMTP(mailModel);
    }
}
