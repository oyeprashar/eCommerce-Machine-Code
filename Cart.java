package main.java.com.company.entities;

import java.util.*;

public class Cart {

    private List <Product> cartItems = new ArrayList<Product>();

    public void addItem(Product item){
        cartItems.add(item);
    }

    public double viewItems(){
        System.out.println("Viewing the items added to your cart");
        double total = 0;
        for (Product cartItem : cartItems) {
            System.out.println("Item Name : " + cartItem.name + " price : " + cartItem.price);
            total += cartItem.price;
        }
        return total;
    }

    public void checkOut(){
        System.out.println("-------- Checking out --------");
        double totalAmount = viewItems();
        cartItems.clear();
        System.out.println("Total Payable Amount = Rs " + totalAmount);
    }
}



