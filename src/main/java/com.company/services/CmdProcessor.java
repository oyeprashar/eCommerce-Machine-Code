package main.java.com.company.services;

import main.java.com.company.entities.Cart;
import main.java.com.company.entities.Product;
import main.java.com.company.entities.User;
import main.java.com.company.entities.Warehouse;
import java.util.Scanner;

public class CmdProcessor {

    private CmdProcessor(){
        // Displaying the command menu
        System.out.println("------ LIST OF COMMANDS -------");
        System.out.println(">> view all products : to view all available products");
        System.out.println(">> buy itemName : to buy a product");
        System.out.println(">> view cart : to view items added to your cart");
        System.out.println(">> checkout : to check out and pay");
        System.out.println(">> exit : to stop using our system");
        System.out.println("-------------------------------");
    }

    private static CmdProcessor cmdProcessorObj;

    public static CmdProcessor getInstance(){
        if (cmdProcessorObj == null){
            cmdProcessorObj = new CmdProcessor();
        }
        return cmdProcessorObj;
    }

    public void process(String currCmd, Warehouse warehouseObj, TransactionProcessorType1 tProcessor, Cart currCart, User currUser) {

        if (currCmd.equals("view all products")) {
            warehouseObj.viewItems();
        } else if (currCmd.startsWith("buy")) {
            String productName = currCmd.substring(4);
            tProcessor.buyItem(warehouseObj, productName, currUser, currCart);
        } else if (currCmd.equals("view cart")) {
            currCart.viewItems();
        } else if (currCmd.equals("checkout")) {
            currCart.checkOut();
        } else if (currCmd.startsWith("delete")) {
            String productName = currCmd.substring(7);
            warehouseObj.deleteItem(productName, currUser.isAdmin);
        } else if (currCmd.equals("add product")) {

            if (!currUser.isAdmin) {
                System.out.println("PERMISSION DENIED");
            } else {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter product name : ");
                String productName = sc.nextLine();
                productName = productName.toLowerCase();

                System.out.println("Enter product id : ");
                String productId = sc.nextLine();
                long lproductId = Long.parseLong(productId);

                System.out.println("Enter product desc : ");
                String productDesc = sc.nextLine();

                System.out.println("Enter product price : ");
                String productPrice = sc.nextLine();
                double lproductPrice = Double.parseDouble(productPrice);

                Product currProduct = new Product(productName, lproductId, productDesc, lproductPrice);

                warehouseObj.addItemWarehouse(currProduct);
            }
        }
        else  {
            System.out.println("INVALID COMMAND!");
        }

    }
}
