package discord.webhook_test.controller;

import discord.webhook_test.Service.WebHookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/event")
public class ApiController {

    private final WebHookService webHookService;

    @GetMapping("")
    public String getEvent(){

        return "get";
    }

    @PostMapping("")
    public String postEvent(){
        System.out.println("hi");
        // 이벤트 처리 ...
        webHookService.callEvent();
        return "이벤트 발생!";
    }



}
