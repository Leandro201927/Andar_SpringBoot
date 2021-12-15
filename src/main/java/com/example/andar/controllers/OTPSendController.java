package com.example.andar.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpSession;

import com.example.andar.services.OTPService;
import com.fasterxml.jackson.databind.JsonNode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
@RequestMapping()
public class OTPSendController {
    @Autowired
    OTPService otpService;

    @PostMapping("/send-otp")
    public Map<Boolean, String> sendOTP(@RequestBody JsonNode jsonNode, HttpSession session) throws NullPointerException {
        Map<Boolean, String> result = new HashMap<Boolean, String>();
        try {
            String email = jsonNode.get("email").asText();
            int min = 1000;  
            int max = 9999;  
            int otp = (int)(Math.random()*(max-min+1)+min);
            session.setAttribute("otp", otp);
            return this.otpService.sendMailOTP(email, otp);
        } catch (NullPointerException e) {
            result.put(false, "NullPointerException: "+e.getMessage());
            return result;
        }
    }

    @PostMapping("/verify-otp")
    public Map<Boolean, String> verifyOTP(@RequestBody JsonNode jsonNode, HttpSession session) throws NullPointerException {
        Map<Boolean, String> result = new HashMap<Boolean, String>();
        try {
            Integer otp = (Integer) jsonNode.get("otp").asInt();
            int sessionOTP = (int) session.getAttribute("otp");
            if(sessionOTP == otp) {
                result.put(true, "OTP matches with server value");
                return result;
            } else {
                result.put(false, "OTP does not match with server value");
                return result;
            }
        } catch (NullPointerException e) {
            result.put(false, "NullPointerException: "+e.getMessage());
            return result;
        }
    }
}
