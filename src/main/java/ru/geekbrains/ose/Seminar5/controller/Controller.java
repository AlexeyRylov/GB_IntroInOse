package ru.geekbrains.ose.Seminar5.controller;

import ru.geekbrains.ose.Seminar5.model.Student;
import ru.geekbrains.ose.Seminar5.model.Type;
import ru.geekbrains.ose.Seminar5.model.User;
import ru.geekbrains.ose.Seminar5.service.DataService;
import ru.geekbrains.ose.Seminar5.view.StudentView;

import java.util.List;

public class Controller {
    DataService dataService = new DataService();
    StudentView view = new StudentView();
    public void createStudent (String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }
    public void getAllStudent(){
        List<User> userList = dataService.getStudentAll();
        for (User user : userList) {
            view.printConsole((Student) user);
        }
    }
}
