package org.cplee.sampleapi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.cplee.sampleapi.model.SampleApiResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(SpringExtension.class)
@WebMvcTest(SampleApiController.class)
class SampleApiControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void whenGet_thenReturns200() throws Exception {
        MvcResult mockMvcResult = mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andReturn();
        SampleApiResponse response = objectMapper.readValue(mockMvcResult.getResponse().getContentAsString(), SampleApiResponse.class);
        assertEquals("Welcome to the machine.", response.getMessage());
        assertEquals(Instant.now().getEpochSecond(), response.getTimestamp().getEpochSecond(), 1);
    }
}