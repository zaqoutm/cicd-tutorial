package com.mo.cicdtutorial.api;

import com.mo.cicdtutorial.logic.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloController.class) // create just Hello controller
//@WebMvcTest
public class HelloControllerMockTest {

    @Autowired
    MockMvc mockMvc;

    @MockitoBean
    MyService myService;

    @Test
    void greeting() throws Exception {
        when(myService.greet()).thenReturn("Hello, Mock");

        this.mockMvc.perform(get("/api/pub/greet")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello, Mock")));
    }
}
