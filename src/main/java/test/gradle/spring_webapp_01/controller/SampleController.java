package test.gradle.spring_webapp_01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/hello")
    public String sayHello(){
        return "hello world!! syhwang!!!!!!  app version 4.0 (2025-04-25)";
    }
}
