package ru.geekbrains.ose.HomeWork05.model;

public class Teacher extends User {
    private int TeacherID;

    public Teacher(String firstName, String secondName, String lastName, int teacherID) {
        super(firstName, secondName, lastName);
        TeacherID = teacherID;
    }

    public int getTeacherId() {
        return TeacherID;
    }

    public void setTeacherId(int teacherID) {
        TeacherID = teacherID;
    }
}
