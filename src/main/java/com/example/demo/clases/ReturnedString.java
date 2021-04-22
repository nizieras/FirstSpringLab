package com.example.demo.clases;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;

import lombok.Data;

@Data
@AllArgsConstructor
public class ReturnedString {
    @JsonProperty("Результат")
    private String returnedString;
}
