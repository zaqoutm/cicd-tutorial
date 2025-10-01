package com.mo.cicdtutorial.logic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MyServiceTest {

    @Mock
    MyService service;

    @Test
    void greeting() {
        when(service.greet()).thenReturn("Hello, Mock");

        String greetMessage = service.greet();
        assertThat(greetMessage).isEqualTo("Hello, Mock");
    }

    @Test
    void increaseNumbers() {
        when(service.increaseNumbers(1)).thenReturn(5d);

        double result = service.increaseNumbers(1);
        assertThat(result).isEqualTo(5);
    }
}