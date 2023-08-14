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
            double x1 = inputDouble("Ввод действительного значения числа 1: ");
            double x2 = inputDouble("Ввод мнимого значения числа 1: ");
            Calculations calculations = newCalculator.create(x1, x2);
            while (true){
                String operation = inputString("Ввод операции: +-*/ или = для вывода результата");
                if (operation.equals("+")){
                    double y1 = inputDouble("Ввод действительного значения числа 2: ");
                    double y2 = inputDouble("Ввод мнимого значения числа 2: ");
                    calculations.add(y1, y2);
                    continue;
                }
                if (operation.equals("-")){
                    double y1 = inputDouble("Ввод действительного значения числа 2: ");
                    double y2 = inputDouble("Ввод мнимого значения числа 2: ");
                    calculations.sub(y1, y2);
                    continue;
                }
                if (operation.equals("*")){
                    double y1 = inputDouble("Ввод действительного значения числа 2: ");
                    double y2 = inputDouble("Ввод мнимого значения числа 2: ");
                    calculations.mul(y1, y2);
                    continue;
                }
                if (operation.equals("/")){
                    double y1 = inputDouble("Ввод действительного значения числа 2: ");
                    double y2 = inputDouble("Ввод мнимого значения числа 2: ");
                    calculations.div(y1, y2);
                    continue;
                }
                if (operation.equals("=")){
                    double[] result = calculations.getResult();
                    System.out.printf("Результат: %f + %fi\n", result[0], result[1]);
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
