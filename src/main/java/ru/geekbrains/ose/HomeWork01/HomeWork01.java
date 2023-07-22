package ru.geekbrains.ose.HomeWork01;

import java.util.*;

public class HomeWork01 {
    public static void main(String[] args) {
        HotDrink drink1 = new HotDrink("Tea", 5, 50);
        System.out.print("Первый напиток в автомате: " + drink1.toString() + "\n");

        HotDrink drink2 = new HotDrink("Milk", 10, 60);
        System.out.print("Второй напиток в автомате: " + drink2.toString() + "\n");

        List<Product> productList = new ArrayList<>();
        boolean addDrink;
        addDrink = productList.add(drink1);
        addDrink = productList.add(drink2);

        HotDrinkVendingMachine machine1 = new HotDrinkVendingMachine();
        boolean addDrinkList;
        addDrinkList = machine1.addProduct(productList);

        System.out.print("Поиск в автомате напитка Tea: " + machine1.getProduct("Tea") + "\n");
        //System.out.print("Поиск в автомате напитка Beer: " + machine1.getProduct("Beer") + "\n");

        System.out.print("Поиск в автомате напитка Tea по цене 5 c температурой 50: " + machine1.getProduct("Tea", 5.0, 50) + "\n");
        //System.out.print("Поиск в автомате напитка Tea по цене 100 c температурой 50: " + machine1.getProduct("Tea", 100.0, 50) + "\n");
        //System.out.print("Поиск в автомате напитка Beer по цене 5 c температурой 50: " + machine1.getProduct("Beer", 5.0, 50) + "\n");


    }
}
