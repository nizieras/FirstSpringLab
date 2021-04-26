package com.example.demo.service;

import com.example.demo.clases.ReturnedString;
import org.springframework.stereotype.Service;

@Service
public class MyStringActionImpl implements MyStringAction {
    public ReturnedString stringToUpCase(String line){ return new ReturnedString(line.toUpperCase()); }
    public ReturnedString stringToLowCase(String line){ return new ReturnedString(line.toLowerCase()); }
    public ReturnedString stringUnion(String firstLine, String secondLine){
        return new ReturnedString(firstLine + secondLine);
    }
}
