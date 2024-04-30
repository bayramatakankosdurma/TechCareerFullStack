package com.atakankosdurma;
import java.io.IOException;
import java.util.Arrays;

public class _10_Array {

    public static void arrayData() {
        int[] dizi = new int[9];
        dizi[0]=8;
        dizi[1]=3;
        dizi[2]=2;
        dizi[8]=1;
        //for
        for(int i = 0; i< dizi.length ;i++){
            System.out.println(dizi[i]+ " ");
        }
        System.out.println("\n");
        //foreach
        for(int j : dizi){
            System.out.println(j+ " ");
        }

        System.out.println("\nHash Code: "+dizi.hashCode());

        int[] cloneData = dizi.clone();
        Arrays.sort(cloneData);
        for(int temp : cloneData){
            System.out.println(temp + " ");
        }


    }

    public static void main(String[] args) {
        arrayData();
    }

}
