/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlineshoppingsystem;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author talha
 */
public class OrderTracking {
    private ArrayList<TrackingItem> tracnkingitemlist = new ArrayList<>();
    
    String generateTrackingId() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        return String.valueOf(randomNumber);
    }
    
    void addTrackingItem(ArrayList<GroceryItem> groceryitemslist) {
        String trackingId = this.generateTrackingId();
        TrackingItem trackingitem=new TrackingItem(trackingId,groceryitemslist);
        this.tracnkingitemlist.add(trackingitem);
        System.out.println("Your Tracking Id is: " + trackingId);
    }
    
    ArrayList<TrackingItem> getOrderTrackingList() {
        return this.tracnkingitemlist;
    }
}
