package com.company;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public int generateOfferPage() {
        System.out.println("\t1. Show available goods.");
        System.out.println("\t2. Buy random bouquet.");
        System.out.println("\t3. Generate own bouquet.");
        System.out.println("\t4. Show available bouquet.");
        System.out.println("\t5. Leave shop.");

        int result = Integer.parseInt(scanner.nextLine());
        return result;
    }
}
