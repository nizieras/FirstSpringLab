package com.example.demo.clases;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class ReturnedString {
    @JsonProperty("Результат")
    private String returnedString;
}
