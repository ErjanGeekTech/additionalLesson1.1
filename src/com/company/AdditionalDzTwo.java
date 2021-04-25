package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
public class AdditionalDzTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = scanner.nextLine();
        int length = word.length();
        int mid = 0;

        if (length % 2 == 0){
            word = word.substring(0, word.length() - 2);
            System.out.println(word);
        }else {
            mid = word.length() / 2 - 1;
            char h = word.charAt(mid);
            System.out.print(h);
            mid = word.length() / 2;
            h = word.charAt(mid);
            System.out.print(h);
            mid++;
            h = word.charAt(mid);
            System.out.print(h);

        }
    }
}
