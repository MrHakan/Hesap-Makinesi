package me.mrhakan;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner islemGir = new Scanner(System.in);
        System.out.print("İşlem yöntemi giriniz" + "\n" + "Toplama için: 1 | " + "Çıkarma için: 2 | " + "Çarpma için: 3 | " + "Bölme için: 4 " + "giriniz" + "\n:" );
        int yontem = islemGir.nextInt();

        Scanner sayi1gir = new Scanner(System.in);
        System.out.println("1. Sayıyı giriniz: ");
        int sayi1 = sayi1gir.nextInt();

        Scanner sayi2gir = new Scanner(System.in);
        System.out.println("2. Sayıyı giriniz: ");
        int sayi2 = sayi2gir.nextInt();

        if (yontem == 1) {
            int toplama = sayi1 + sayi2;
            System.out.println("Sonuç: " + toplama);
        }

        if (yontem == 2) {
            int cikarma = sayi1 - sayi2;
            System.out.println("Sonuç: " + cikarma);
        }

        if (yontem == 3) {
            int carpma = sayi1 * sayi2;
            System.out.println("Sonuç: " + carpma);
        }

        if (yontem == 4) {
            int bolme = sayi1 / sayi2;
            System.out.println("Sonuç: " + bolme);
        }

    }
}
