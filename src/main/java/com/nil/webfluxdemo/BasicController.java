package com.nil.webfluxdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author penelope
 */
@RestController
public class BasicController {

    @GetMapping("/hello")
    public Mono<String> sayHelloWorld() {
        return Mono.just("Hello World");
    }

}
