package com.safereach.codechallenge.donottouch;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Integer.toHexString;
import static java.util.Optional.ofNullable;

@Service
public class DoNotTouchProcessor {

    private final DataRepository repository;

    public DoNotTouchProcessor(DataRepository repository) {
        this.repository = repository;
    }

    public List<Data> run() {
        return ofNullable(repository.findByContent(randomHexString())).orElseGet(ArrayList::new);
    }

    private String randomHexString() {
        return toHexString(new Random().nextInt()).substring(0,6);
    }
}
