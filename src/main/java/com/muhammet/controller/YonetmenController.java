package com.muhammet.controller;

import com.muhammet.service.YonetmenService;

import static com.muhammet.utility.Tools.*;
public class YonetmenController {

    private final YonetmenService yonetmenService;

    public YonetmenController(){
        yonetmenService = new YonetmenService();
    }


    public void yonetmenEkle(){
        System.out.println("""
                ****** YÖNETMEN EKLE *******
                """);
        String ad = getParameterString("yönetmen adı....: ");
        String biyografi = getParameterString("yönetmen biyografi.....: ");
        String avatar = "https://picsum.photos/300/300/";
        Integer kariyerYili = getParameterInteger("yönetmen kariyer yılı...: ");
        Integer filmSayisi = getParameterInteger("yönetmen film sayisi....: ");
        yonetmenService.addYonetmen(ad,biyografi,avatar,kariyerYili,filmSayisi);
    }

    public void yonetmenListele(){
        System.out.println("""
                ******* YÖNETMEN LISTELE *******
                """);
        yonetmenService.findAll().forEach(y->{
            System.out.println(y);
        });
    }
}
