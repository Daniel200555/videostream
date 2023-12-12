package com.example.demo.controller;


import com.example.demo.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class Controller {

    @Autowired
    private ServiceImpl service;

    @GetMapping(value = "video", produces = "video/mp4")
    public Mono<Resource> getVideo(@RequestParam(value = "title")String title) {
        return service.getVideo(title);
    }

}
