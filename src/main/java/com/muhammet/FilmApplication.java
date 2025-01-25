package com.muhammet;

import com.muhammet.controller.YonetmenController;

import static com.muhammet.utility.Tools.*;

public class FilmApplication {
    private static YonetmenController yonetmenController = new YonetmenController();
    public static void main(String[] args) {
        int secim;
        do {
            secim = mainRunner();
        }while (secim != 0);
    }

    private static int mainRunner(){
        System.out.println("""
                ************************************************
                *********      FİLM UYGULAMASI     *************
                ************************************************
                1- [Yonetmen Ekle]
                2- [Yonetmen Listele]
                3- [Yonetmen Sil]
                4- [Film Ekle]
                5- [Film Listele]
                6- [Film Sil]
                0- [Ç I K I Ş]
                """);
        int secim = getParameterInteger("lütfen seçiniz....: ");
        switch (secim){
            case 1: yonetmenController.yonetmenEkle(); break;
            case 2: yonetmenController.yonetmenListele(); break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 0:
                System.out.println("Çıkış yapıldı"); break;
            default:
                System.out.println("Lütfen geçerli bir seçim yapınız"); break;
        }
        return secim;
    }

}
