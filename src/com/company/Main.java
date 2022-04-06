package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x ");
        int x = scanner.nextInt();
        System.out.print("Введите y ");
        int y = scanner.nextInt();
        System.out.print("Введите z ");
        int z = scanner.nextInt();
        Formula did = new Formula(x,y,z);
        did.displayFormula();
    }
}
