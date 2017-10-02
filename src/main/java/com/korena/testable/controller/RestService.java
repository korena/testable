package com.korena.testable.controller;


import com.korena.testable.Operations;
import com.korena.aircraft.model.Aircraft;
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
        int randomThingForMathMutationTests = 0;
        operations.operate(aircraft);
        randomThingForMathMutationTests++;
        return "Operating Boeing " + randomThingForMathMutationTests;
    }

}
