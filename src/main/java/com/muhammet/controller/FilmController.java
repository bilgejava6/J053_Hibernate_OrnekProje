package com.muhammet.controller;

import com.muhammet.entity.Film;
import com.muhammet.service.FilmService;
import com.muhammet.utility.enums.Tur;

import java.util.ArrayList;
import java.util.List;

import static com.muhammet.utility.Tools.*;
public class FilmController {
    private final FilmService filmService;
    public FilmController() {
        filmService = new FilmService();
    }

    public void filmEkle(){
        System.out.println("""
                **** Film Ekle ****
                """);
        String ad = getParameterString("film adı.....: ");
        String ozet = getParameterString("film özet.....: ");
        String yonetmenAdi = getParameterString("yönetmen adı.....: ");
        Long yonetmenId = getParameterLong("yönetmen id.....: ");
        String senarist = getParameterString("senarist....: ");
        Integer puan = getParameterInteger("puan.....: ");
        Tur tur = Tur.valueOf(getParameterString("tur......: "));
        List<Long> artistIds = new ArrayList<>();
        System.out.println("artis id lerini giriniz çıkmak için [-1] giriniz.");
        Long artistId;
        do{
            artistId = getParameterLong("artist id.....: ");
            if (artistId > 0) artistIds.add(artistId);
        }while (artistId != -1);
        filmService.addFilm(ad,ozet,yonetmenAdi,yonetmenId,senarist,puan,tur,artistIds);
    }

    public void filmListele(){
        System.out.println("""
                **** Film Listele ****
                """);
        List<Film> list =  filmService.findAll();
        list.forEach(System.out::println);
    }
}
