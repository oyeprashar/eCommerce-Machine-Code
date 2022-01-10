package main.java.com.company.services;

import main.java.com.company.entities.Cart;
import main.java.com.company.entities.User;
import main.java.com.company.entities.Warehouse;

public interface TransactionProcessor {

    void buyItem(Warehouse warehouseObj, String productName, User currUser, Cart currCart);
}
