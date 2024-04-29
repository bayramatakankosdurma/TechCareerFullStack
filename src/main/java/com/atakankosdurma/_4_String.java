package com.atakankosdurma;

import java.util.Locale;

public class _4_String {

    public static void main(String[] args) {
        //String
        String vocabulary = " java OGReniyorum java";
        System.out.println(vocabulary);
        System.out.println(vocabulary.length());
        System.out.println(vocabulary.toLowerCase());
        System.out.println(vocabulary.toUpperCase());
        System.out.println(vocabulary.charAt(1));

        System.out.println(vocabulary.indexOf("java"));
        System.out.println(vocabulary.lastIndexOf("java"));
        System.out.println(vocabulary.lastIndexOf("memed"));

        System.out.println(vocabulary.substring(3));
        System.out.println(vocabulary.substring(2,5));

        System.out.println(vocabulary.startsWith(" "));
        System.out.println(vocabulary.endsWith("a"));


        System.out.println(vocabulary.concat(" abe"));
        vocabulary = vocabulary.concat(" yag si demem");
        System.out.println(vocabulary);

        System.out.println(vocabulary.contains("java"));
        System.out.println(vocabulary.replace(vocabulary, "yag si demem"));


    }

}
