package br.com.ggpsgeorge.sprintutorialmaven.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ggpsgeorge.sprintutorialmaven.services.Message;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        Message helloMessage = new Message("Oi, eu sou o Goku! Tenho ", 42);
        return helloMessage.getMessage() + String.valueOf(helloMessage.getAge()) + " anos";
    }
}
