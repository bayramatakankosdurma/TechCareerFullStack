package com.atakankosdurma;

import java.util.Scanner;

public class _2_OperatorsAndScanner {

    public static void main(String[] args) {
        /*
        * arithmetic operators known as +, -, %, *, /,
        * */
        int number1 = 2;
        int number2 = 7;
        System.out.println("Toplam = "+ (number2 + number1));
        System.out.println("Çıkarma = "+ (number2 - number1));
        System.out.println("Bölme = "+ (number2 / number1));
        System.out.println("Toplam = "+ (number2 + number1));
        System.out.println("Kalan = "+ (number2 % number1));

        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen İsminizi Giriniz");
        String name = girdi.nextLine();
        System.out.println("Adınız =" + name);
    }

}
