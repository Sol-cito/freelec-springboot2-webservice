package com.solcito.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* Application이 현재 프로젝트의 main class 이다. */

@SpringBootApplication //이 어노테이션으로 인해 boot의 Spring bean 읽기, 생성 등이 모두 자동으로 설정된다.
public class Application {
    public static void main(String[] args) {
        /* SpringApplication.run 으로 인해 boot의 내부 WAS가 실행된다.
        * 내장 WAS가 존재하므로 서버에 톰캣을 설치할 필요가 없으며,
        * boot로 만들어진 Jar 파일 (실행가능한 java패키지 파일)로 실행하면 됨. */
        SpringApplication.run(Application.class, args);
    }
}
