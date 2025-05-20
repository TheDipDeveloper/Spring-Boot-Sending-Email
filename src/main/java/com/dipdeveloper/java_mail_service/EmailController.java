package com.dipdeveloper.java_mail_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public String sendMail(@RequestBody EmailDetails details) {
        return emailService.sendSimpleMail(details);
    }

    @PostMapping("/sendWithAttachment")
    public String sendMailWithAttachment(@RequestBody EmailDetails details) {
        return emailService.sendMailWithAttachment(details);
    }
}