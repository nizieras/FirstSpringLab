package com.example.demo.controllers;

import com.example.demo.service.MyStringAction;
import com.example.demo.clases.ReturnedString;
import com.example.demo.service.StringAppHomePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stringAct")
public class MainController {

    private MyStringAction myStringAction;
    private StringAppHomePage stringActHome;
    private ReturnedString returnedString;

    @Autowired
    public MainController(MyStringAction myStringAction, StringAppHomePage stringActHome)
    {
        this.stringActHome = stringActHome;
        this.myStringAction = myStringAction;
    }

    @GetMapping("/")
    public StringAppHomePage stringAct() {
        return this.stringActHome;
    }

    @GetMapping("/toUpCase")
    public ReturnedString transmittedStrToUpCase(@RequestParam String string){
        return new ReturnedString(myStringAction.stringToUpCase(string));
    }

    @GetMapping("/toLowCase")
    public ReturnedString transmittedStrToLowCase(@RequestParam String string){
        return new ReturnedString(myStringAction.stringToLowCase(string));
    }

    @GetMapping("/union")
    public ReturnedString transmittedStrUnion (@RequestParam String string, @RequestParam String secString){
        return new ReturnedString (myStringAction.stringUnion(string, secString));
    }
}
