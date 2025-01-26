package com.muhammet.controller;

import com.muhammet.entity.Artist;
import com.muhammet.service.ArtistService;

import java.util.Date;
import java.util.List;

import static com.muhammet.utility.Tools.*;
public class ArtistController {

    private final ArtistService artistService;
    public ArtistController(){
        artistService = new ArtistService();
    }


    public void artistEkle(){
        System.out.println("""
                **** Artist Ekle ***
                """);
        String ad = getParameterString("artist adını giriniz...: ");
        String adres = getParameterString("artist adresini giriniz...: ");
        Date dogumTarihi = new Date();
        Integer yas = getParameterInteger("artist yaşını giriniz..: ");
        String avatar ="https://picsum.photos/100/100";
        String biyografi = getParameterString("artist biyografisini giriniz...: ");
        Integer kariyerYili = getParameterInteger("artist kariyer yili giriniz...: ");
        Integer filmDiziAdedi = getParameterInteger("artist film dizi giriniz...: ");
        artistService.addArtist(ad,adres,dogumTarihi,yas,avatar,biyografi,kariyerYili,filmDiziAdedi);

    }

    public void artistListele(){
        List<Artist> list = artistService.findAll();
        System.out.println("""
                **** Artist Listele ***
                """);
        list.forEach(System.out::println);
    }
}
