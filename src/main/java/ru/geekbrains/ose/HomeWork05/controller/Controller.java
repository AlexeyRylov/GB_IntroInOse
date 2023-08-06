package ru.geekbrains.ose.HomeWork05.controller;

import ru.geekbrains.ose.HomeWork05.model.Student;
import ru.geekbrains.ose.HomeWork05.model.Teacher;
import ru.geekbrains.ose.HomeWork05.model.Type;
import ru.geekbrains.ose.HomeWork05.model.User;
import ru.geekbrains.ose.HomeWork05.service.DataService;
import ru.geekbrains.ose.HomeWork05.service.StudentGroupService;
import ru.geekbrains.ose.HomeWork05.view.StudentView;

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
    public StudentGroupService studentGroupService = new StudentGroupService();
    public void createStudentGroup(Teacher teacher, List<Student> studentList){
        this.studentGroupService.createStudentGroup(teacher, studentList);
    }

    public void getStudentGroupId (){
        List<Student> studentGroup = studentGroupService.getStudentList();
        for (User user: studentGroup) {
            Student student = (Student) user;
            System.out.println("Student Id: " + student.getStudentId());
        }
    }

    public void getTeacherId () {
        Teacher teacher = studentGroupService.getStudentGroup().getTeacher();
        System.out.println("Teacher Id: " + teacher.getTeacherId());
    }
}
