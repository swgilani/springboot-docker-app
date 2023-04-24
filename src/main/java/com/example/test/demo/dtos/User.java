package com.example.test.demo.dtos;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class User {
    private String id;
    private String name;

    private List<String> qualities;
}
