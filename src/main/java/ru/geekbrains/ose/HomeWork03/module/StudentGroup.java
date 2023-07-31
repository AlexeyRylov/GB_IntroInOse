package ru.geekbrains.ose.HomeWork03.module;
import ru.geekbrains.ose.HomeWork03.iterator.StudentGroupIterator;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}