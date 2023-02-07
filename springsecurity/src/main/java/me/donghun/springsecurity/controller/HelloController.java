package me.donghun.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }

    @GetMapping("/login")
    public String main(){
        return "login";
    }
    
    @GetMapping("/face")
    public String face(){
        return "face";
    }

    @GetMapping("/face_student")
    public String face_student(){
        return "face_student";
    }

    @GetMapping("/login_pro")
    public String login(){
        return "login_pro";
    }
    @GetMapping("/end_pro")
    public String end_pro(){
        return "end_pro";
    }

    @GetMapping("/end")
    public String end(){
        return "end";
    }
}