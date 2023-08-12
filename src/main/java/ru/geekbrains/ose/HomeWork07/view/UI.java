package ru.geekbrains.ose.HomeWork07.view;

import ru.geekbrains.ose.HomeWork07.interfaces.Calculations;
import ru.geekbrains.ose.HomeWork07.interfaces.NewCalculator;

import java.util.Scanner;

public class UI {
    private NewCalculator newCalculator;
    public UI(NewCalculator newCalculator){
        this.newCalculator = newCalculator;
    }
    public void start(){
        while (true){
            double firstNum = inputDouble("Ввод значения 1: ");
            Calculations calculations = newCalculator.create(firstNum);
            while (true){
                String operation = inputString("Ввод операции: +-*/ или = для вывода результата");
                if (operation.equals("+")){
                    double num = inputDouble("Ввод значения 2: ");
                    calculations.add(num);
                    continue;
                }
                if (operation.equals("-")){
                    double num = inputDouble("Ввод значения 2: ");
                    calculations.sub(num);
                    continue;
                }
                if (operation.equals("*")){
                    double num = inputDouble("Ввод значения 2: ");
                    calculations.mul(num);
                    continue;
                }
                if (operation.equals("/")){
                    double num = inputDouble("Ввод значения 2: ");
                    calculations.div(num);
                    continue;
                }
                if (operation.equals("=")){
                    double result = calculations.getResult();
                    System.out.printf("Результат %f\n", result);
                    break;
                }
            }
            String operation = inputString("Выполнить еще расчет? да/нет: ");
            if (operation.equals("да")){
                continue;
            }
            break;
        }
    }
    private String inputString(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    private double inputDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}
