package ru.geekbrains.ose.HomeWork07.logger;

import ru.geekbrains.ose.HomeWork07.controller.Controller;
import ru.geekbrains.ose.HomeWork07.interfaces.Calculations;
import ru.geekbrains.ose.HomeWork07.interfaces.NewCalculator;
import ru.geekbrains.ose.HomeWork07.interfaces.WriteLog;

public class NewLog implements NewCalculator {
    private WriteLog writeLog;
    public NewLog (WriteLog writeLog){
        this.writeLog = writeLog;
    }
    @Override
    public Calculations create(double number){
        return new CalculationLog(new Controller(number), writeLog);
    }
}
