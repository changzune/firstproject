package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYoy(Model model){
        model.addAttribute("username","zune");

    return "greetings"; //tepletes/greetings.mutache -> 브라우저로 전송!

    }
    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname","zune");
        return "goodbye";
    }


}
