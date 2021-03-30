package com.solcito.springboot;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@WebMvcTest
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc; // 가짜 MVC를 Autowired로 bean 주입받은 후, API를 테스트하는 클래스

    @Test
    public void returnHello() throws Exception {
        String hello = "hello World";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk()) // 결과가 200 인지
                .andExpect(content().string(hello));
    }
}
