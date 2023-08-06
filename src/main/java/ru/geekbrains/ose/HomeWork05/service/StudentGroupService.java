package ru.geekbrains.ose.HomeWork05.service;

import ru.geekbrains.ose.HomeWork05.model.Student;
import ru.geekbrains.ose.HomeWork05.model.StudentGroup;
import ru.geekbrains.ose.HomeWork05.model.Teacher;

import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;
    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students){
        this.studentGroup = new StudentGroup(teacher, students);
        return studentGroup;
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }
    public List<Student> getStudentList() {
        return studentGroup.getStudentList();
    }
}
