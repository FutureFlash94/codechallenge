package com.safereach.codechallenge.donottouch;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DataRepository extends CrudRepository<Data, Long> {
    List<Data> findByContent(String content);
}
