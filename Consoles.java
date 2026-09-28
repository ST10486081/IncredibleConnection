/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.incredibleconnection;
import java.util.Scanner;


/**
 *
 * @author Nomali Thando Msiza
 */public abstract class Console implements IConsole {
    private String consoleType;
    private String store;
    private int totalSales;

    public Console(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return store;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
}