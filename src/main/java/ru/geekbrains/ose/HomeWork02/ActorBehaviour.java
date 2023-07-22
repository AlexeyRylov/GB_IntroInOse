package ru.geekbrains.ose.HomeWork02;

public interface ActorBehaviour {
    void setMakeOrder(boolean status);
    void setTakeOrder(boolean status);
    boolean isMakeOrder();
    boolean isTakeOrder();

}
