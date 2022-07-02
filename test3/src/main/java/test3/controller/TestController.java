package test3.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${appname}")
    private String appName;

    @GetMapping("/hello")
    public String sayHello(@RequestParam String name) {
        return "hello " + name;
    }

    @GetMapping("/config")
    public String sayHello() {
        return "name is  " + appName;
    }
}
