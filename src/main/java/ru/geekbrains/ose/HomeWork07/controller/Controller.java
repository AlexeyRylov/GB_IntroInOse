package ru.geekbrains.ose.HomeWork07.controller;

import ru.geekbrains.ose.HomeWork07.interfaces.Calculations;

public class Controller implements Calculations {
    private Double input;
    public Controller(Double input){
        this.input = input;
    }
    @Override
    public Calculations add(double num) {
        this.input += num;
        return this;
    }
    @Override
    public Calculations sub(double num) {
        this.input -= num;
        return this;
    }
    @Override
    public Calculations mul(double num) {
        this.input *= num;
        return this;
    }
    @Override
    public Calculations div(double num) {
        this.input /= num;
        return this;
    }

    @Override
    public double getResult() {
        return input;
    }
}
