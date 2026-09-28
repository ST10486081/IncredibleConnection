/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.incredibleconnection;
import java.util.Scanner;


/**
 *
 * @author Nomali Thando Msiza
 */public class GameConsoleReport {

    public static void main(String[] args) {
        // Single-dimensional arrays
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Two-dimensional array storing sales per city and console
        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200}  // Pretoria
        };

        System.out.println("------------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-20s %-10s %-10s %-10s%n", "", consoles[0], consoles[1], consoles[2]);

        int[] cityTotals = new int[cities.length];
        int maxSales = -1;
        String topCity = "";

        // Display sales matrix and calculate totals
        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%-20s ", cities[i]);
            int rowTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-10d ", sales[i][j]);
                rowTotal += sales[i][j];
            }
            cityTotals[i] = rowTotal;
            System.out.println();

            if (rowTotal > maxSales) {
                maxSales = rowTotal;
                topCity = cities[i];
            }
        }

        System.out.println("------------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %d%n", cities[i], cityTotals[i]);
        }

        System.out.println("------------------------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("------------------------------------------------------------------");
    }
}