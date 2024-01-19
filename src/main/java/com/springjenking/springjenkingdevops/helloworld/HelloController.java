package com.springjenking.springjenkingdevops.helloworld;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.http.HttpResponse;

@Controller
@RequestMapping(value = "/api")
public class HelloController {

    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello world, CI/CD pipeline with Jenkins and docker!!!");
    }

}
