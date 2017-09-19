package com.korena.testable.controller;


import com.korena.testable.Operations;
import com.korena.testable.model.Aircraft;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class RestService {

    private final Operations operations;

    private final Aircraft aircraft;


    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/start")
    public String invokeOperationOnBoeing(){

        operations.operate(aircraft);

        return "Operating Boeing";
    }

}
