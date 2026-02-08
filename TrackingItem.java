/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlineshoppingsystem;
import java.util.ArrayList;
/**
 *
 * @author talha
 */
public class TrackingItem {    
    String trackingid;
    ArrayList<GroceryItem> groceryItemsList = new ArrayList<>();
    
    TrackingItem(String trackingid,ArrayList<GroceryItem> groceryitem) {
        this.trackingid=trackingid;
        this.groceryItemsList=groceryitem;
    }
}


