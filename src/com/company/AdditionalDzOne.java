package com.company;

import java.util.Scanner;

public class AdditionalDzOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите зарплату: ");
        double price = scanner.nextDouble();
        double i = price * 50 / 100;
        System.out.println("Бонусы 5%: " + (i * 5 / 100));
        double p = price * 30 / 100;
        System.out.println("Бонусы 8%: "+(p * 8 / 100));
        double o = price * 20 / 100;
        System.out.println("Бонусы 10%: "+(o * 10 / 100));
        System.out.println("Всего: " +((i * 5 / 100) + (p * 8 / 100) + (o * 10 / 100)));
    }
}
