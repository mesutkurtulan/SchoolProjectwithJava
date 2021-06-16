package proje3_okulYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    private List<Kisi> ogrenciListesi = new ArrayList<>();
    private List<Kisi> ogretmenListesi = new ArrayList<>();
    private String kisiTuru;

    public void anaMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println(" ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q- ÇIKIŞ");
        String secim = scan.next().toUpperCase();

        if (secim.equals("Q")) {
           cikis();
        } else if (secim.equals("1")) {
            kisiTuru="OGRENCI";
            islemMenusu();
        } else if (secim.equals("2")) {
            kisiTuru="OGRETMEN";
            islemMenusu();
        } else {
            System.out.println("Yanlis Giris Yaptiniz..");
            anaMenu();
        }
    }

    private void islemMenusu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("============= İŞLEMLER =============");
        System.out.println("1-EKLEME");
        System.out.println("2-ARAMA");
        System.out.println("3-LİSTELEME");
        System.out.println("4-SİLME");
        System.out.println("5-ANA MENÜ");
        System.out.println("Q-ÇIKIŞ\n");
        System.out.println("SEÇİMİNİZ:");

        String tercih = scan.next().toUpperCase();

        switch (tercih) {
            case "1": ekle();
                break;
            case "2": ara();
                break;
            case "3": listele();
                break;
            case "4": sil();
                break;
            case "5": anaMenu();
                break;
            case "Q": cikis();
                break;
            default:
                System.out.println("Yanlis Giris Yaptiniz..");
                islemMenusu();
                break;
        }
    }
    private void cikis() {
        System.out.println("Programi Kullnadiginiz icin Tesekkur Ederiz");
    }

    private void ekle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("------------"+kisiTuru+" EKLEME SAYFASI------------");
        System.out.println("Ad ve Soyad Giriniz");
        String adSoyad = scan.nextLine();
        System.out.println("Kimlik No  Giriniz");
        String kimlikNo = scan.next();
        System.out.println("Yas Giriniz");
        int yas = scan.nextInt();
        if (kisiTuru.equals("OGRENCI")) {
            System.out.println("Numaranizi Giriniz");
            String numara = scan.next();
            System.out.println("Sinif Giriniz");
            String sinif = scan.next();
            Ogrenci ogrenci = new Ogrenci(adSoyad,kimlikNo,yas,numara,sinif);
            ogrenciListesi.add(ogrenci);
        }else {
            System.out.println("Sicilinizi Giriniz");
            String sicilNo = scan.next();
            System.out.println("Bolum Giriniz");
            String bolum = scan.next();
            Ogretmen ogretmen = new Ogretmen(adSoyad,kimlikNo,yas,sicilNo,bolum);
            ogretmenListesi.add(ogretmen);
        }
        islemMenusu();
    }

    private void ara() {

        islemMenusu();
    }

    private void listele() {

        islemMenusu();
    }

    private void sil() {

        islemMenusu();
    }

}
