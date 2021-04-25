package com.company;

import java.util.Scanner;

public class AdditionalDzThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int s = 0, c; 
        int a = 0;
        for (c = 1; c <= n; c++){
            s = s * 10 + 1;
            System.out.print(s + " ");
            if (c < n){
                System.out.print("+ ");
            }
        }
        System.out.print("\nСумма: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
        }

    }
}
