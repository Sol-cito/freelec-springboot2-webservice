package com.solcito.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    /* 요청 URL을 어떤 메서드가 처리할지 mapping해주는 Annotation.
     * 컨트롤러나 컨트롤러의 메서드에 적용
     * @PostMapping, @DeleteMapping 등 REST API에 맞는 어노테이션 존재
     */
    @GetMapping("/hello")
    public String hello() {
        return "hello World";
    }
}
