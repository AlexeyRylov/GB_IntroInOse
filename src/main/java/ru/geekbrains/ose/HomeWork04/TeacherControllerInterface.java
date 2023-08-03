package ru.geekbrains.ose.HomeWork04;
public interface TeacherControllerInterface<T extends Teacher> {
    void create(String firstName, String secondName, Long teacherID);
}