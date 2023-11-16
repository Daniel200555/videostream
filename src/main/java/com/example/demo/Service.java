package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import reactor.core.publisher.Mono;

@org.springframework.stereotype.Service
public class Service {

    private static final String FILE_PATH = "classpath://home/danil/ftp/files/%s.mp4";

    @Autowired
    private ResourceLoader resourceLoader;

    public Mono<Resource> getVideo(String title) {
        return Mono.fromSupplier(() -> resourceLoader.getResource(String.format(FILE_PATH, title)));
    }

}
