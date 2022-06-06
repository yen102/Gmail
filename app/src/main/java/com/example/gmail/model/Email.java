package com.example.gmail.model;

public class Email{
    int imageSender;
    String emailSender;
    String time;
    String content;
    boolean isImportant;

    public Email(int imageSender, String emailSender, String time, String content, boolean isImportant) {
        this.imageSender = imageSender;
        this.emailSender = emailSender;
        this.time = time;
        this.content = content;
        this.isImportant = isImportant;
    }

    public int getImageSender() {
        return imageSender;
    }

    public String getContent() {
        return content;
    }

    public String getEmailSender() {
        return emailSender;
    }

    public String getTime() {
        return time;
    }
    public boolean isImportant() {
        return isImportant;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setEmailSender(String emailSender) {
        this.emailSender = emailSender;
    }

    public void setImageSender(int imageSender) {
        this.imageSender = imageSender;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
