package ru.geekbrains.ose;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{
    private List<HotDrink> products = new ArrayList<>();
    public HotDrinkVendingMachine() {
        this.products = products;
    }

    public Product getProduct(String name){
        for(Product product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
    public HotDrink getProduct(String name, double cost, int temperature){
        for(HotDrink product: products){
            if(product instanceof HotDrink){
                if (product.getName().equalsIgnoreCase(name) &&
                        (double)product.getCost() == cost &&
                        (int)product.getTemperature() == temperature){
                    return product;
                }
            }
            /*if(product.getName().equalsIgnoreCase(name) &&
            product.getCost() == cost &&
            product.getTemperature() == temperature){
                return product;
            }*/
        }
        throw new IllegalStateException(String.format("Продукт c названием %s, стоимостью %.1f и температурой %d не найден.", name, cost, temperature));
    }

    @Override
    public boolean addProduct(List<Product> productList) {
        if(products == null && productList == null){
            return false;
        }
        for (Product item: productList) {
            products.add((HotDrink) item);
        }
        return true;
    }
}
