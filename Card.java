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
public class Card {
    Scanner sc=new Scanner(System.in);
    
    boolean handleCardPayment()  {
        System.out.println("Please Enter Card Number::");
        int num = sc.nextInt();
        System.out.println("Please Enter Pin Number::");
        int pin = sc.nextInt();
        sc.nextLine();
        System.out.println("Thank You!.Press any key to go back");
        sc.nextLine();
        return true;
    }
           
}


