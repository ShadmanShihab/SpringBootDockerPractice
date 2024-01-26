package com.example.springbootdockerpractice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {
    @GetMapping("/home")
    public String home() throws JsonProcessingException {
        Map<String, String> mp = new HashMap<>();
        mp.put("status_code", "200");
        mp.put("message", "hello");
        ObjectMapper objectMapper = new ObjectMapper();
        String jacksonData = objectMapper.writeValueAsString(mp);
        return jacksonData;
    }
}
