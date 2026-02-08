/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlineshoppingsystem;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author talha
 */
public class Order extends OrderTracking {
    int sum=0;
    Scanner sc = new Scanner(System.in);
    Payment payment = new Payment();
    
    boolean printOrder(ArrayList<GroceryItem> groceriesList) {
        System.out.println("Your Current Order is ");   
        for (GroceryItem groceryItem : groceriesList) {
          System.out.println(groceryItem.item + " " + groceryItem.price);
          sum+=groceryItem.price;
        } 
        System.out.println("Total Bill of Order::"+sum);
        return this.chooseOption(groceriesList);   
    }
    
    boolean chooseOption(ArrayList<GroceryItem> groceriesList) {
        System.out.println("Do you want to Continue to Payment");
        System.out.println("Y=Yes Continue to Payment");
        System.out.println("N= Discard Order");
        
        char ch=sc.next().charAt(0);
        if(ch=='Y' || ch=='y') {
            boolean paymentStatus = payment.handlePayment();
            
            if (paymentStatus) {
                this.addTrackingItem(groceriesList);
            }
            
            return paymentStatus;
        }
        
        return true;
    }
    
    ArrayList<TrackingItem> getTrackingItemList() {
        return this.getOrderTrackingList();
    }
}
