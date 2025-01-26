package com.muhammet.service;

import com.muhammet.entity.Artist;
import com.muhammet.repository.ArtistRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class ArtistService {
    private final ArtistRepository repository;
    public ArtistService(){
        repository = new ArtistRepository();
    }
    public void addArtist(String ad, String adres, Date dogumTarihi, Integer yas, String avatar, String biyografi, Integer kariyerYili, Integer filmDiziAdedi) {
        Artist artist = Artist.builder()
                .ad(ad)
                .adres(adres)
                .dogumTarihi(dogumTarihi)
                .yas(yas)
                .avatar(avatar)
                .biyografi(biyografi)
                .kariyerYili(kariyerYili)
                .filmDiziAdedi(filmDiziAdedi)
                .build();
        repository.save(artist);
    }

    public List<Artist> findAll() {
        return repository.findAll();
    }

    public Optional<Artist> findById(Long id) {
        return repository.findById(id);
    }
}
