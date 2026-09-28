/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.incredibleconnection;
import static java.lang.System.console;
import java.util.Scanner;


/**
 *
 * @author Student
 */
public class GamingConsoleReport {
    @SuppressWarnings("empty-statement")
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String [] console = {"Play Station 5", "X-BOX", "Nintendo Switch"};
        
        int [][] sales = new int [3][3];
        {1 000 , 2 000 , 3 000}
        {2 000 3 000 4 000}
        { 1 500 1 100 1 200}
        System.out.println("Enter the number of sales in each city: ");
        for(int i=0; i < cities.legnth; i++){
            for(j=0;)j < console.legnth; j++){
            System.out.print("Enter sales for" + cities[i] + ")" + console[j]+"):");
            sales[i][j] = scanner.nextInt();
            
        }
        }
        
        System.out.println("\n--------------------------------------");
        System.out.println("GAMING CONSOLE report");
         System.out.println("\n--------------------------------------");
         System.out.println( "CITY");
         for (String city: cities){
             System.out.println(city.toUpperCase());
             
         }
         System.out.println();
          System.out.println("------------------");
          
          System.out.println("TOTAL CONSOLE SALES FOR EACH CITY");
          System.out.println("------------------");
          int cityTotal = -1;
          String highestSales = "";
        int i = 0;
          
          
          for ( int = 0 i < cities.legnth; i++){
              int cityTotal = 0;
              
              for(int j=0; j < console.legnth; j++){
                  cityTotal += console[i][j];
              }
              System.out.print(cities[i] + "\t\t" + cityTotal);
              
              if(cityTotal > highestSales){
                  int higestSales = cityTotal;
                  String totalSales = cities[i];
                    
              }
              
          }
         
    }
    System.out.println("------------------------------------------------------------------------------------------");
    System.out.println("         CITY WITH THE HIGHEST CONSOLE SALES: " + totalSales + highestSales);
    System.out.println("------------------------------------------------------------------------------------------");
    
    
   }

