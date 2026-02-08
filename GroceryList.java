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
public class GroceryList extends ItemsQuantity {
    Scanner sc = new Scanner(System.in);

    private void printlist() {
        System.out.println("Please Choose one of the following");
        System.out.println("1-Rice = 100/kg");
        System.out.println("2-Milk = 500/Lt");
        System.out.println("3-Eggs = 300/Dz");
        System.out.println("4-Bread = 600");
        System.out.println("5-Sugar = 900/kg");
    }
    
    private int chooseGroceryOption() {
         int number = sc.nextInt();
        
        if (number > 5) {
            System.out.println("Please Choose a Number Between 1-5");
            return this.chooseGroceryOption();    
        }
   
        return number;
    }
    
    public void handleGroceryList() {
        this.printlist();
        
        boolean continueShopping;
        switch(this.chooseGroceryOption()) {
            case 1:
                continueShopping = this.handleQuantity("Rice", 100);
                
                if (continueShopping) this.handleGroceryList();
                break;
            case 2:
                continueShopping = this.handleQuantity("Milk", 500);
                
                if (continueShopping) this.handleGroceryList();
                break;
            case 3:
                continueShopping = this.handleQuantity("Eggs", 300);
                
                if (continueShopping) this.handleGroceryList();
                break;
            case 4:
                continueShopping = this.handleQuantity("Bread", 600);
                
                if (continueShopping) this.handleGroceryList();
                break;
            case 5:  
                continueShopping = this.handleQuantity("Sugar", 900);
                
                if (continueShopping) this.handleGroceryList();
                break;
        }
    }
}
