package com.muhammet.repository;

import com.muhammet.entity.Yonetmen;

public class YonetmenRepository extends RepositoryManager<Yonetmen,Long> {
    public YonetmenRepository() {
        super(new Yonetmen());
    }
}
