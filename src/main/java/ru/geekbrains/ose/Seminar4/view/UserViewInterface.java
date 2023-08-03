package ru.geekbrains.ose.Seminar4.view;
import ru.geekbrains.ose.Seminar4.data.User;

import java.util.List;

public interface UserViewInterface<T extends User> {
    /**
     * Принцип единственной ответственности, данный интерфейс выполняет только один метод печати.
     * Принцип разделения интерфейса (ISP)
     */
    public void sendOnConsole(List<T> listT);
}