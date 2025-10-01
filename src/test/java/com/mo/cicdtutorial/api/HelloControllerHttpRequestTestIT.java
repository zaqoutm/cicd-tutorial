package com.mo.cicdtutorial.api;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloControllerHttpRequestTestIT {

    @LocalServerPort
    int port;

    @Autowired
    TestRestTemplate template;

    @Test
    void greet() {
        assertThat
                (this.template.getForObject("http://localhost:" + port + "/api/pub/greet", String.class))
                .contains("Hello, World");
    }

    @Disabled
    void calc() {
    }
}