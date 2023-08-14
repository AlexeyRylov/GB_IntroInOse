package ru.geekbrains.ose.HomeWork07.interfaces;

public interface Calculations {
    Calculations add(double y1, double y2);
    Calculations sub(double y1, double y2);
    Calculations mul(double y1, double y2);
    Calculations div(double y1, double y2);
    double[] getResult();
}
