package org.cplee.sampleapi.controller;

import org.cplee.sampleapi.model.SampleApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleApiController {
    @GetMapping("/")
    SampleApiResponse get() {
        return new SampleApiResponse();
    }
}
