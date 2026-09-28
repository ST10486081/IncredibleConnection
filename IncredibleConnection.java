/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.incredibleconnection;
import java.util.Scanner;


/**
 *
 * @author Nomali Thando Msiza
 */import java.util.Scanner;

public class IncredibleConnection {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter console device type: ");
        String consoleType = scanner.nextLine();

        System.out.print("Enter store name: ");
        String store = scanner.nextLine();

        System.out.print("Enter total amount of sales: ");
        int totalSales = scanner.nextInt();

        // Instantiate ConsoleSales object and print output report
        ConsoleSales salesReport = new ConsoleSales(consoleType, store, totalSales);
        salesReport.printReport();

        scanner.close();
    }
}