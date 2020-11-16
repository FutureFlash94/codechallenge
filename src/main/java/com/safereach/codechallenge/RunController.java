package com.safereach.codechallenge;

import com.safereach.codechallenge.donottouch.DoNotTouchProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RunController {

    @Autowired
    private DoNotTouchProcessor processor;

    @GetMapping("/run")
    public String run() {
        return processor.run().toString();
    }

}
