/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlineshoppingsystem;
import java.util.Scanner;
import java.util.NoSuchElementException;
/**
 *
 * @author talha
 */
public class Menu extends AbstractUtils {
    String message="Thank you for Shopping!";
    Scanner sc = new Scanner(System.in);
    Order order = new Order();
    GroceryList groceryList = new GroceryList();
    
    private void printMenu() {
        System.out.println("Please Choose one of the following::");
        System.out.println("1- Shopping");
        System.out.println("2- Order Tracking");
        System.out.println("3- Customer Support");
        System.out.println("4-Exit");
    }
    
    private int chooseOption() { 
        int number = sc.nextInt();
        
        if (number > 4) {
            System.out.println("Please Choose a Number Between 1-4");
            return this.chooseOption();    
        }
        
        return number;
    }
    
    public void handleMenu() {
        this.printMenu();
        switch(this.chooseOption()) {
            case 1:
                groceryList.handleGroceryList();
                boolean startover=order.printOrder(groceryList.getGroceriesItems());

                if(startover) {
                    groceryList.clearGroceriesList();
                    this.handleMenu();
                }
                break;
             
            case 2:
                try {
                    TrackingScreen trackingscreen=new TrackingScreen(order.getTrackingItemList());
                    trackingscreen.handleItemTracking();
                } catch (NoSuchElementException e) {
                    System.out.println("Caught Exception: " + e.getMessage());
                } finally {
                    this.handleMenu();
                }
                break;
            case 3:
                CustomerSupport cs = new CustomerSupport();
                cs.handleSupport();
                this.handleMenu();
                cs.handleSupport(message);
                break;
            case 4:
                System.out.println("Thank you for Visiting us!");
                break;
        }
    }
    
}

