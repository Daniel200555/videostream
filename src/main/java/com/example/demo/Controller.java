package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class Controller {

    @Autowired
    private Service service;

    @GetMapping(value = "video/{title}", produces = "video/mp4")
    public Mono<Resource> getVideo(@PathVariable(value = "title")String title) {
        return service.getVideo(title);
    }

}
