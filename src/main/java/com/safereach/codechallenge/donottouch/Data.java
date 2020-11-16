package com.safereach.codechallenge.donottouch;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Data {
    private Long id;
    private String content;

    public Data() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Data{id=" + id + ", content='" + content + '\'' + '}';
    }
}
