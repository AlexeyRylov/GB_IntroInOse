package ru.geekbrains.ose.HomeWork07.logger;

import ru.geekbrains.ose.HomeWork07.interfaces.Calculations;
import ru.geekbrains.ose.HomeWork07.interfaces.WriteLog;

public class CalculationLog implements Calculations {
    private Calculations getResult;
    private WriteLog log;
    public CalculationLog (Calculations getResult, WriteLog log){
        this.getResult = getResult;
        this.log = log;
    }
    @Override
    public Calculations add(double y1, double y2){
        double[] firstNum = getResult.getResult();
        log.log(String.format("Число %f. Сложение с числом %f", firstNum, y1));
        Calculations result = getResult.add(y1, y2);
        log.log(String.format("Сложение"));
        return result;
    }
    @Override
    public Calculations sub(double y1, double y2){
        double[] firstNum = getResult.getResult();
        log.log(String.format("Число %f. Вычитание числа %f", firstNum, y1));
        Calculations result = getResult.sub(y1, y2);
        log.log(String.format("Вычитание"));
        return result;
    }
    @Override
    public Calculations mul(double y1, double y2){
        double[] firstNum = getResult.getResult();
        log.log(String.format("Число %f. Умножение на число %f", firstNum, y1));
        Calculations result = getResult.mul(y1, y2);
        log.log(String.format("Умножение"));
        return result;
    }
    @Override
    public Calculations div(double y1, double y2){
        double[] firstNum = getResult.getResult();
        log.log(String.format("Число %f. Деление на число %f", firstNum, y1));
        Calculations result = getResult.div(y1, y2);
        log.log(String.format("Деление"));
        return result;
    }
    @Override
    public double[] getResult() {
        double[] result = getResult.getResult();
        log.log(String.format("Результат %f", result));
        return result;
    }
}
