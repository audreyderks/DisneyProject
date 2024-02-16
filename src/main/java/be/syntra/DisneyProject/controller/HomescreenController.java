package be.syntra.DisneyProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomescreenController {
    @GetMapping("/")
    public String home() {
            return "homescreen";
        }
}
