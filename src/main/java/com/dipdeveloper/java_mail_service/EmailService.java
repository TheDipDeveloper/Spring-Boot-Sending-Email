package com.dipdeveloper.java_mail_service;

public interface EmailService {
    String sendSimpleMail(EmailDetails details);
    String sendMailWithAttachment(EmailDetails details);
}
