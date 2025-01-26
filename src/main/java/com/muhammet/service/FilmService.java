package com.muhammet.service;

import com.muhammet.entity.Artist;
import com.muhammet.entity.Film;
import com.muhammet.repository.FilmRepository;
import com.muhammet.utility.enums.Tur;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FilmService {
    private final FilmRepository filmRepository;
    private final ArtistService artistService;
    public FilmService(){
        filmRepository = new FilmRepository();
        artistService = new ArtistService();
    }

    public void addFilm(String ad, String ozet, String yonetmenAdi, Long yonetmenId, String senarist, Integer puan, Tur tur, List<Long> artistIds) {
        List<Artist> artistList = new ArrayList<>();
        artistIds.forEach(id->{
            Optional<Artist> artist = artistService.findById(id);
            if(artist.isPresent()) {
                artistList.add(artist.get());
            }
        });
        Film film = Film.builder()
                .ad(ad)
                .ozet(ozet)
                .yonetmenAdi(yonetmenAdi)
                .yonetmenId(yonetmenId)
                .senarist(senarist)
                .puan(puan)
                .tur(tur)
                .artistList(artistList)
                .build();
        filmRepository.save(film);
    }

    public List<Film> findAll() {
        return filmRepository.findAll();
    }
}
