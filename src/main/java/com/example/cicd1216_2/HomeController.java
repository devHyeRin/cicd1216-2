package com.example.cicd1216_2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hicicd")
    public String hicicd(){
        return "hicicd 1216 ^^^^^";
    }

    @GetMapping("/hicicd2")
    public String hicicd2(){
        return "새로운 개발 ^^^^^";
    }

    @GetMapping("/hicicd3")
    public String hicicd3(){
        return "새로운 개발 cicd 적용 ^^^^^";
    }

    @GetMapping("/hi")
    public String hi2(){
        return "HIHIHIHIHI";
    }
    @GetMapping("/hi2")
    public String hi3(){
        return "1216 cicd2 ^^^";
    }
}
