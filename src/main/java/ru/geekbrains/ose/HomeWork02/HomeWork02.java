package ru.geekbrains.ose.HomeWork02;

public class HomeWork02 {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("AAA");
        Human human2 = new Human("BBB");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
    }
}
