package com.example.demo.service;

import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import reactor.core.publisher.Mono;

@org.springframework.stereotype.Service
public non-sealed class ServiceImpl implements Service {

    private static final String FILE_PATH = "file://home/danil/ftp/files/%s.mp4";

    private ResourceLoader resourceLoader;
    private Environment environment;
    private String path;

    public ServiceImpl(ResourceLoader resourceLoader, Environment environment) {
        this.resourceLoader = resourceLoader;
        this.environment = environment;
        this.path = "file:" + environment.getProperty("stream.path");
    }

    public Mono<Resource> getVideo(String title) {
        return Mono.fromSupplier(() -> resourceLoader.getResource(path + title));
    }

}
