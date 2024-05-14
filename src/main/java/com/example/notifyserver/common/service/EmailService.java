package com.example.notifyserver.common.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Component
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    public void sendNotificationEmail(String to, String nickname, String keyword, String postId) {
        String subject = "키워드 " + keyword + "에 대한 새로운 알림";
        String content = nickname + "님이 설정하신 키워드 " + keyword + "와 관련된 새 게시물이 등록되었습니다. 아래 링크에서 게시물을 확인하세요.\n링크: " + postId;

        sendEmail(to, subject, content);
    }

    private void sendEmail(String to, String subject, String text) {
        MimeMessage message = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        try {
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(text);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        emailSender.send(message);
    }
}
