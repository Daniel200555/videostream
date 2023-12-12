package com.example.demo.service;

import org.springframework.core.io.Resource;
import reactor.core.publisher.Mono;

public sealed interface Service permits ServiceImpl {

    Mono<Resource> getVideo(String title);

}
