/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlineshoppingsystem;
import java.util.Scanner;
/**
 *
 * @author talha
 */
public class CashDelivery {
    Scanner sc = new Scanner(System.in);
    
    boolean handleCashDelivery() {
        System.out.println("Please Enter your House Address::");
        String address = sc.nextLine();
        System.out.println("Thank You!.Press any key to go back");
        sc.nextLine();
        return true;   
    }
}


