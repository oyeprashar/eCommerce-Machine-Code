package main.java.com.company.entities;

import java.util.*;

public class Warehouse {

    private Warehouse(){};
    private static Warehouse warehouseObj;

    public static Warehouse getInstance(){
        if (warehouseObj == null){
            warehouseObj = new Warehouse();
        }
        return warehouseObj;
    }

    public HashMap<String, Product> productList = new HashMap<>();

    public void addItemWarehouse(Product item){
        if (!productList.containsKey(item.name)) {
            System.out.println(item.name + " was added to the warehouse");
            productList.put(item.name,item);
        }

        else {
            System.out.println("The product already exists");
        }
    };

    public void deleteItem(String itemName, boolean isAdmin){

        if (!isAdmin){
            System.out.println("PERMISSION DENIED!");
        }
        else if (productList.containsKey(itemName)) {
            System.out.println(itemName + " was removed from the warehouse");
            productList.remove(itemName);
        }

        else{
            System.out.println("The product does not exists");
        }
    }

    public void viewItems(){

        System.out.println("-------- AVAILABLE ITEMS --------");
        for (Map.Entry mapElement : productList.entrySet()){
            String productName = (String)mapElement.getKey();
            Product productObj = productList.get(productName);
            System.out.println(productObj.name + " " + productObj.price + " " + productObj.desc + " " + productObj.productId);

        }
    }
}



