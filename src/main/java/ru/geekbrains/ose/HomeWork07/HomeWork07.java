package ru.geekbrains.ose.HomeWork07;

import ru.geekbrains.ose.HomeWork07.interfaces.NewCalculator;
import ru.geekbrains.ose.HomeWork07.interfaces.WriteLog;
import ru.geekbrains.ose.HomeWork07.logger.ConsoleLog;
import ru.geekbrains.ose.HomeWork07.logger.NewLog;
import ru.geekbrains.ose.HomeWork07.view.UI;

public class HomeWork07 {
    public static void HomeWork07(String[] args) {
        System.out.println("\nWelcome to my new calculator!\n");
        NewCalculator newCalculator = new NewLog(new ConsoleLog());
        UI console = new UI(newCalculator);
        console.start();
    }
}
