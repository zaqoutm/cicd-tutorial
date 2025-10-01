package com.mo.cicdtutorial;

import com.mo.cicdtutorial.api.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class SmokeTestIT {

    @Autowired
    HelloController helloController;

    @Test
    void contextLoad() {
        assertThat(helloController).isNotNull();
    }
}
