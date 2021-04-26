package com.example.demo.service;

import com.example.demo.clases.ReturnedString;

public interface MyStringAction {
    ReturnedString stringToUpCase(String line);
    ReturnedString stringToLowCase(String line);
    ReturnedString stringUnion(String firstLine, String secondLine);

}
