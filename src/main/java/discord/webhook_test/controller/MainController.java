package discord.webhook_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @PostMapping("/")
    public String Main(){
        return "main";
    }

    @GetMapping("/")
    public String mainGet(){
        System.out.println("hi");
        return "index";
    }

}
