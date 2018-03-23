package io.insource.tutorials.appengine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/_ah/start")
    public String start() {
        return "OK";
    }

    @GetMapping("/_ah/stop")
    public String stop() {
        return "OK";
    }
}
