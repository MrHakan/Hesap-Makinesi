package me.mrhakan;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner islemGir = new Scanner(System.in);
        System.out.print("İşlem yöntemi giriniz: " );
        String yontem = islemGir.nextLine();

        Scanner sayi1gir = new Scanner(System.in);
        System.out.println("1. Sayıyı giriniz: ");
        int sayi1 = sayi1gir.nextInt();

        Scanner sayi2gir = new Scanner(System.in);
        System.out.println("2. Sayıyı giriniz: ");
        int sayi2 = sayi2gir.nextInt();

        String topla = "Toplama";
        String cikar = "Çıkarma";
        String carp = "Çarpma";
        String bol = "Bölme";

        if (yontem.equals(topla)) {
            int toplama = sayi1 + sayi2;
            System.out.println("Sonuç: " + toplama);
        } else {
            if (yontem.equals(cikar)) {
                int cikarma = sayi1 - sayi2;
                System.out.println("Sonuç: " + cikarma);
            } else {
                if (yontem.equals(carp)) {
                    int carpma = sayi1 * sayi2;
                    System.out.println("Sonuç: " + carpma);
                } else {
                    if (yontem.equals(bol)) {
                        int bolme = sayi1 / sayi2;
                        System.out.println("Sonuç: " + bolme);
                    } else {
                        System.out.println("İşlem yöntemi geçersiz bir yöntemdir lütfen tekrar giriniz.");
                    }
                }
            }
        }
    }
}
