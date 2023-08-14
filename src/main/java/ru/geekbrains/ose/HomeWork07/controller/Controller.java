package ru.geekbrains.ose.HomeWork07.controller;
import ru.geekbrains.ose.HomeWork07.interfaces.Calculations;

public class Controller implements Calculations {
    private double[] res = new double[2];

    public Controller(double x1, double x2){
        res[0] = x1;
        res[1] = x2;
    }
    @Override
    public Calculations add(double y1, double y2) {
        res[0] += y1;
        res[1] += y2;
        return this;
    }
    @Override
    public Calculations sub(double y1, double y2) {
        res[0] -= y1;
        res[1] -= y2;
        return this;
    }
    @Override
    public Calculations mul(double y1, double y2) {
        res[0] *= y1;
        res[1] *= y2;
        return this;
    }
    @Override
    public Calculations div(double y1, double y2) {
        res[0] /= y1;
        res[1] /= y2;
        return this;
    }

    @Override
    public double[] getResult() {
        return res;
    }
}
