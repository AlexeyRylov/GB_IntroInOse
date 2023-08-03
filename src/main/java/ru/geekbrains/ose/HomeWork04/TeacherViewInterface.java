package ru.geekbrains.ose.HomeWork04;
import java.util.List;

public interface TeacherViewInterface<T extends Teacher> {
    public void sendOnConsole(List<T> tList);
}