package com.example.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.dto.ModelDTO;

@RestController
@RequestMapping("/api/model")
public class ModelController {

    @PostMapping
    public void Create(@RequestBody ModelDTO req) {
        System.out.println(req);

    }
}
