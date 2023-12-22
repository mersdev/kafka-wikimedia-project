package com.xdman.wikiproducer.rest;

import com.xdman.wikiproducer.config.stream.WikimediaStreamConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/wikimedia")
public class WikimediaController {
    private final WikimediaStreamConsumer streamConsumer;

    @GetMapping
    public void startPublishing(){
        streamConsumer.consumeStreamAndPublish();
    }
}
