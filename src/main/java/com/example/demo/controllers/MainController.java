package com.example.demo.controllers;

import com.example.demo.service.StringService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MainController {

    private final StringService myStringAction;

    @GetMapping("/toUpCase")
    public String transmittedStrToUpCase(@RequestParam String string){
        return myStringAction.stringToUpCase(string);
    }

    @GetMapping("/toLowCase")
    public String transmittedStrToLowCase(@RequestParam String string){
        return myStringAction.stringToLowCase(string);
    }

    @GetMapping("/union")
    public String transmittedStrUnion (@RequestParam String string, @RequestParam String secString){
        return myStringAction.stringUnion(string, secString);
    }
}
