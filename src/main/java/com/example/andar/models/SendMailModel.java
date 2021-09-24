package com.example.andar.models;

public class SendMailModel {
    private String from;
    private String to;
    private String host;
    private String fromPassword;

    public SendMailModel(String from, String to, String host, String fromPassword) {
        this.from = from;
        this.to = to;
        this.host = host;
        this.fromPassword = fromPassword;
    }

    public String getFrom() {
        return this.from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return this.to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getFromPassword() {
        return this.fromPassword;
    }

    public void setFromPassword(String fromPassword) {
        this.fromPassword = fromPassword;
    }


}
