package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class StringServiceImpl implements StringService {
    public String stringToUpCase(String line){ return line.toUpperCase(); }
    public String stringToLowCase(String line){ return line.toLowerCase(); }
    public String stringUnion(String firstLine, String secondLine){ return firstLine + secondLine; }
}
