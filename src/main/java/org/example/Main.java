package org.example;
/**
 * ***************************************************************
 * Sales.java
 * <p>
 * Reads in and stores sales for each of 5 salespeople. Displays
 * sales entered by salesperson id and total sales for all salespeople.
 * <p>
 * ***************************************************************
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int SALESPEOPLE;
        int sum;
        double average;
        int maxValue;
        int minValue;
        int maxId = 0;
        int minId = 0;
        int counter = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("How many sales people: ");
        SALESPEOPLE = scan.nextInt();
        if (SALESPEOPLE <= 0) {
            System.out.println("Number of salespeople must be positive.");
            return;
        }

        int[] sales = new int[SALESPEOPLE];

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
        }

        maxValue = sales[0];
        minValue = sales[0];

        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i = 0; i < sales.length; i++) {
            System.out.println(" " + (i + 1) + " " + sales[i]);
            sum += sales[i];
            if (sales[i] > maxValue) {
                maxValue = sales[i];
                maxId = i;
            }

            if (sales[i] < minValue) {
                minValue = sales[i];
                minId = i;
            }
        }

        average = (double) sum / sales.length;

        System.out.println("Salesperson " + maxId + " had the highest sale with $" + maxValue);
        System.out.println("Salesperson " + minId + " had the lowest sale with $" + minValue);
        System.out.println("Average sales: " + average);
        System.out.println("\nTotal sales: " + sum);

        System.out.print("Enter an amount you wish to check: ");
        int amount = scan.nextInt();
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > amount) {
                counter++;
                System.out.println("Salesperson " + i + " amounts: " + sales[i]);
            }
        }
        System.out.println("Total salespersons: " + counter);
    }
}