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
public class CustomerSupport {
    Scanner sc = new Scanner(System.in);
    void handleSupport() {
        System.out.println("Please enter your query?");
        sc.nextLine();
        System.out.println("Thank you for your query, we'll reach back to you shortly.");
    }
    void handleSupport(String message) { // Method Overloading
        System.out.println(message);
        
    }
}



