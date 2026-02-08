/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlineshoppingsystem;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.NoSuchElementException;
/**
 *
 * @author talha
 */
public class TrackingScreen {
    Scanner sc=new Scanner(System.in);
    ArrayList<TrackingItem> trackingitemlist= new ArrayList<>();
    
    TrackingScreen(ArrayList<TrackingItem> trackingitemlist) {
        this.trackingitemlist=trackingitemlist;
    }
    
    void handleItemTracking() {
        System.out.println("Please Enter the Tracking ID");
        String trackingid=sc.nextLine();
        
        boolean foundTrackingId = false;
        for (TrackingItem trackingitem : this.trackingitemlist) {
          if(trackingid.equals(trackingitem.trackingid)) {
              foundTrackingId = true;
              System.out.println("Your Order");
              for (GroceryItem groceryItem : trackingitem.groceryItemsList) {
                System.out.println(groceryItem.item + " " + groceryItem.price);
              }
            break;
          }
        }
        
        if (!foundTrackingId) {
            throw new NoSuchElementException("Tracking id not found!");
        }
    }
            
}

