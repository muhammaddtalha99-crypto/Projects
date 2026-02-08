/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlineshoppingsystem;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author talha
 */
public class ItemsQuantity {
    private ArrayList<GroceryItem> groceryItemsList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    boolean handleQuantity(String item,int price ) {
        System.out.println("Please Enter the Quantity of " + item);
        int quantity=sc.nextInt();
        System.out.println("Your Price for " + item + " with " + quantity + " quantity is " + (price*quantity));
        
        GroceryItem Item = new GroceryItem(item,price);
        groceryItemsList.add(Item);
        
        System.out.println("Do you want to Continue Shopping");
        char ch = sc.next().charAt(0);
        if (ch=='Y'|| ch=='y') {
            return true;
        }
        return false;     
    }
    
    ArrayList<GroceryItem> getGroceriesItems() {
        return this.groceryItemsList;
    }
    
    void clearGroceriesList() {
        this.groceryItemsList = new ArrayList<>();
    }
            
}


