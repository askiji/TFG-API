package com.ramon.guardiasapi.config;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class WebController {

    @GetMapping("/")
    public String redirectToIndex() {
        return "index.html";
    }
    
    @GetMapping("/login")
    public String redirectToLogin() {
        return "index.html";
    }
    
    @GetMapping("/profesor/**")
    public String redirectToProfesor() {
        return "index.html";
    }
    
    @GetMapping("/singup")
    public String singup() {
        return "index.html";
    }
    
    @GetMapping("/selecion")
    public String selecion() {
        return "index.html";
    }
    
    @GetMapping("/admin")
    public String admin() {
        return "index.html";
    }
}
