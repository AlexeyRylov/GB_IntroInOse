package ru.geekbrains.ose.HomeWork01;
import java.util.List;
public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;
    //Product getProduct(String name, Double cost, Integer temperature) throws IllegalStateException;
    boolean addProduct(List<Product> productList);
}
