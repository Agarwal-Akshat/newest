package io.javabrains.springbootquickstart;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class courseAPI {

    @RequestMapping("/topics")
    public String say(){
        return ("Hello!");
    }
}

@SpringBootApplication
public class CourseApiApp{
    public static void main(String[] args) {
        SpringApplication.run(CourseApiApp.class,args);
    }
}

