package com.example.demo.controllers;

import com.example.demo.service.MyStringAction;
import com.example.demo.clases.ReturnedString;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MainController {

    private final MyStringAction myStringAction;

    @GetMapping("/toUpCase")
    public ReturnedString transmittedStrToUpCase(@RequestParam String string){
        return myStringAction.stringToUpCase(string);
    }

    @GetMapping("/toLowCase")
    public ReturnedString transmittedStrToLowCase(@RequestParam String string){
        return myStringAction.stringToLowCase(string);
    }

    @GetMapping("/union")
    public ReturnedString transmittedStrUnion (@RequestParam String string, @RequestParam String secString){
        return myStringAction.stringUnion(string, secString);
    }
}
