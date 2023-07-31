package ru.geekbrains.ose.HomeWork03.controler;

import ru.geekbrains.ose.HomeWork03.module.Steam;
import ru.geekbrains.ose.HomeWork03.module.Student;
import ru.geekbrains.ose.HomeWork03.module.StudentGroup;
import ru.geekbrains.ose.HomeWork03.service.SteamService;
import ru.geekbrains.ose.HomeWork03.service.StudentGroupService;

import java.util.List;

public class Controler {
    private StudentGroupService studentGroupService = new StudentGroupService();

    public void removeStudentByFIO(String lastName,String firstName,String secondName){
        studentGroupService.removeStudentByFIO(lastName,firstName,secondName);
    }

    public List<Student> getSortedStudentList(){
        return studentGroupService.getSortedStudentList();
    }
    public List<Student> getSortedStudentListByFIO(){
        return studentGroupService.getSortedStudentListByFIO();
    }

    private SteamService steamService = new SteamService();
    public List<Steam> getSortedSteam() { return steamService.getSortedSteam();}
}