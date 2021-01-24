package org.cplee.sampleapi.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class SampleApiResponseTest {


    private SampleApiResponse response;

    @BeforeEach
    void setUp() {
        this.response = new SampleApiResponse();
    }

    @AfterEach
    void tearDown() {
        this.response = null;
    }

    @Test
    void getMessage() {
        assertEquals("Welcome to the machine.", response.getMessage());
    }

    @Test
    void getTimestamp() {
        assertEquals(Instant.now().getEpochSecond(), response.getTimestamp().getEpochSecond(), 1);
    }
}