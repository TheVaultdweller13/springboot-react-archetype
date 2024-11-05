package com.example.controllers;

import com.example.services.SayHelloService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SayHelloController {

    private final SayHelloService sayHelloService;

    @Autowired
    public SayHelloController(SayHelloService sayHelloService) {
        this.sayHelloService = sayHelloService;
    }


    @GetMapping("/hello")
    @Operation(summary = "Hello", description = "Say hello!")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success hello"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    public ResponseEntity<?> sayHello() {
        return ResponseEntity.ok(this.sayHelloService.print());
    }
}
