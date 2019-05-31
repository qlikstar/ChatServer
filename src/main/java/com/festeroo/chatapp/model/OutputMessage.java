package com.festeroo.chatapp.model;

import java.util.Date;

public class OutputMessage {

    private String from;
    private String message;
    private String topic;
    private Date time = new Date();

    public OutputMessage(final String from, final String message, final String topic) {
        this.from = from;
        this.message = message;
        this.topic = topic;
        this.time = new Date();
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(final String from) {
        this.from = from;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(final String topic) {
        this.topic = topic;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(final Date time) {
        this.time = time;
    }
}
