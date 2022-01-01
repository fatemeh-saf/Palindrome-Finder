package com.fatemeh.main;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printPalindromes();
    }

    public static void printPalindromes(){
        System.out.println("\n"+"Please enter a string to find its palindrome substrings. String should be ALL CAPITAL LETTERS WITH NO PUNCTUATIONS");

        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        System.out.println("Palindromes in the given string are: ");

        Map<String,Integer> result=PalindromeFinder.findAllPalindromicSubstrings(string);

        if(result.isEmpty()) System.out.println("No palindromic substring found");
        else{
            result.entrySet().forEach(entry -> {
                System.out.println(entry.getKey() + "," + entry.getValue()+","+entry.getKey().length());
            });
        }

        //String string="ABCBAHELLOHOWRACECARAREYOUILOVEUEVOLIIAMAIDOINGGOOD";
        //String string="ABCDCBARARILOVEUEVOLIAMAITTOO";

    }
}
