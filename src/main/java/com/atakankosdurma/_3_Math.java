package com.atakankosdurma;


import java.util.Random;

public class _3_Math {

    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.min(3,4));
        System.out.println(Math.max(3,4));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.pow(2,5));
        System.out.println(Math.abs(-325));
        System.out.println(Math.cos(45));
        System.out.println(Math.floor(3.8));
        System.out.println(Math.ceil(3.8));

        //random
        System.out.println(Math.random()*4+1);
        System.out.println(Math.ceil(Math.random()*4+1));

        Random random = new Random();
        int number3 = random.nextInt(4)+1;
        System.out.println(number3);
    }

}
