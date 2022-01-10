package main.java.com.company.services;

import main.java.com.company.entities.Cart;
import main.java.com.company.entities.User;
import main.java.com.company.entities.Warehouse;

public class TransactionProcessorType1 implements TransactionProcessor {

    private TransactionProcessorType1(){};

    private static TransactionProcessorType1 obj;

    public static TransactionProcessorType1 getInstance(){
        if (obj == null){
            obj = new TransactionProcessorType1();
        }
        return obj;
    }

    public void buyItem(Warehouse warehouseObj, String productName, User currUser, Cart currCart){

        if (warehouseObj.productList.containsKey(productName)){
            currCart.addItem(warehouseObj.productList.get(productName));
            System.out.println(productName +" added to cart of user " + currUser.userId);
        }

        else{
            System.out.println("The product does not exists");
        }
    }
    }



