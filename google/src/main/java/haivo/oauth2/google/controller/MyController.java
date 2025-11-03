package haivo.oauth2.google.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String home(){
        return "Welcome to Website for me";
    }

    @GetMapping("/secured")
    public String secured(){
        return "Welcome to Website for me login with Google";
    }

}
