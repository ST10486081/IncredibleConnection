/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.incredibleconnection;
import java.util.Scanner;


/**
 *
 * @author Nomali Thando Msiza
 */public class ConsoleSales extends Console {

    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    public void printReport() {
        System.out.println("\n----------------------------------------------");
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("----------------------------------------------");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE NAME:   " + getStore());
        System.out.println("TOTAL SALES:  R " + getTotalSales());
        System.out.println("----------------------------------------------");
    }
}