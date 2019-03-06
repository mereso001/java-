package com.stephanie;

public class Strings {
    public static void main(String[] args) {
        String sentence = "The Lazy Dog ";
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence);
        String s=sentence.toLowerCase();
        System.out.println(s);
        System.out.println(sentence.replace("Lazy","hardworking"));
        System.out.println(sentence.length());
    }
}
