package com.muhammet.service;

import com.muhammet.entity.Yonetmen;
import com.muhammet.repository.YonetmenRepository;

import java.util.List;

public class YonetmenService {

    private final YonetmenRepository repository;

    public YonetmenService(){
        repository = new YonetmenRepository();
    }

    public void addYonetmen(String ad, String biyografi, String avatar, Integer kariyerYili, Integer filmSayisi) {
        Yonetmen yonetmen = Yonetmen.builder().ad(ad).biyografi(biyografi).avatar(avatar).kariyerYili(kariyerYili).filmSayisi(filmSayisi).build();
        repository.save(yonetmen);
    }

    public List<Yonetmen> findAll() {
        return repository.findAll();
    }
}
