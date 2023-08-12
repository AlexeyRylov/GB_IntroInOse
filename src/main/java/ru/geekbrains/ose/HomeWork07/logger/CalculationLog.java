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
    public Calculations add(double number){
        double firstNum = getResult.getResult();
        log.log(String.format("Число %f. Сложение с числом %f", firstNum, number));
        Calculations result = getResult.add(number);
        log.log(String.format("Сложение"));
        return result;
    }
    @Override
    public Calculations sub(double number){
        double firstNum = getResult.getResult();
        log.log(String.format("Число %f. Вычитание числа %f", firstNum, number));
        Calculations result = getResult.sub(number);
        log.log(String.format("Вычитание"));
        return result;
    }
    @Override
    public Calculations mul(double number){
        double firstNum = getResult.getResult();
        log.log(String.format("Число %f. Умножение на число %f", firstNum, number));
        Calculations result = getResult.mul(number);
        log.log(String.format("Умножение"));
        return result;
    }
    @Override
    public Calculations div(double number){
        double firstNum = getResult.getResult();
        log.log(String.format("Число %f. Деление на число %f", firstNum, number));
        Calculations result = getResult.div(number);
        log.log(String.format("Деление"));
        return result;
    }
    @Override
    public double getResult() {
        double result = getResult.getResult();
        log.log(String.format("Результат %f", result));
        return result;
    }

}
