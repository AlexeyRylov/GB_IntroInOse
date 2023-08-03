package ru.geekbrains.ose.Seminar4.controller;
import ru.geekbrains.ose.Seminar4.data.Student;
import ru.geekbrains.ose.Seminar4.view.StudentView;
import ru.geekbrains.ose.Seminar4.view.UserViewInterface;

import java.time.LocalDate;
import java.util.List;

public class StudentController implements IUserController{

    private UserViewInterface studentsView = new StudentView();
    @Override
    public void create(String firstName, String surName, String lastName){
        Student newStudent = new Student(firstName, lastName, surName, LocalDate.now());
    }
    public void printConsole(List<Student> students){
        studentsView.sendOnConsole(students);
    }
}