package org.home.todobackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/testssl")
    public String TestSSL() {
        // https://localhost:8080/testssl
        return "Test SSL is work!";
    }

}
