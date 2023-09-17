package com.hongseok.metastandard.web;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class HelloControllerTest {
/*
    @Autowired
    private MockMvc mvc;

    @Test
    @WithMockUser
    public void returnHello() throws Exception{
        String hello = "hello";

        mvc.perform(get("/hello")).andExpect(status().isOk())
                .andExpect(content().string(hello));
    }

    @Test
    public void returnHelloDto() throws Exception{
        String name = "hello";
        int amount = 1000;
      mvc.perform(
                get("/hello/dto").param("name", name).param("amount", String.valueOf(amount))
                        .andExpect(status().isOk())
                        .andExpect(jsonPath("$.name", is(name)))

        )
    }

*/
}
