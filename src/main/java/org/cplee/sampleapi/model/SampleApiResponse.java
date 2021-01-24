package org.cplee.sampleapi.model;

import java.time.Instant;

public class SampleApiResponse {
    private Instant timestamp;
    private String message;

    public SampleApiResponse() {
        timestamp = Instant.now();
        message = "Welcome to the machine.";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
}
