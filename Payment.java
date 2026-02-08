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
public class Payment {
    Scanner sc = new Scanner(System.in);
    
    boolean handlePayment() {
        int choice=this.paymentMethods();
        
        if (choice==3) {
         CashDelivery cashdeleivery = new CashDelivery();
         return cashdeleivery.handleCashDelivery();
        }
        else if(choice==1 || choice==2) {
          Card card = new Card();
          return card.handleCardPayment();
        }
            
        
        return true;
    }
    
    int paymentMethods() {
        System.out.println("Please Choose Payment Method::");
        System.out.println("1-Visa");
        System.out.println("2-Master Card");
        System.out.println("3-Cash on Delivery"); 
        
        return this.chooseOption();  
    }
    
    private int chooseOption() {
        int number = sc.nextInt();

        if (number > 3) {
            System.out.println("Please Choose a Number Between 1-3");
            return this.chooseOption();    
        }

        return number;
    }
}
