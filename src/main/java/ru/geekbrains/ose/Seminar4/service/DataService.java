package ru.geekbrains.ose.Seminar4.service;
import ru.geekbrains.ose.Seminar4.data.Student;
import ru.geekbrains.ose.Seminar4.data.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataService {
    /**
     * Принцип единственной ответственности, данный класс выполняет только одну функцию, работа с датой.
     */
    private List<User> users;

    public DataService() {
        this.users = new ArrayList<>();
    }

    public List<User> getAll(){
        return this.users;
    }

    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (User user: this.users){
            if(user instanceof Student){
                if (((Student) user).getStudentId() > countMaxId){
                    countMaxId = ((Student) user).getStudentId();
                }
            }
        }
        countMaxId++;

        Student student = new Student(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        this.users.add(student);
    }
}