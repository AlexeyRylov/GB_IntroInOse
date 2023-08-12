package ru.geekbrains.ose.HomeWork07.logger;
import ru.geekbrains.ose.HomeWork07.interfaces.WriteLog;
public class ConsoleLog implements WriteLog{
    @Override
    public void log(String message){
        System.out.println("Запись в логи: " + message);
    }
}
