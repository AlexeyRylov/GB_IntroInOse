package ru.geekbrains.ose.HomeWork04;
import java.util.ArrayList;
import java.util.List;
public class HomeWork04 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Ivan", "Ivanov", 12345L);
        Teacher teacher2 = new Teacher("Petr", "Petrov", 12346L);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        TeacherGroup teachers = new TeacherGroup("Science", teacherList);
        TeacherController teacherController = new TeacherController();
        teacherController.create("Ivan", "Ivanov", 12345L);
        teacherController.create("Petr", "Petrov", 12346L);
        teacherController.printConsole(teacherList);
    }
}