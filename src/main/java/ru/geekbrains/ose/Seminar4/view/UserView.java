package ru.geekbrains.ose.Seminar4.view;
import ru.geekbrains.ose.Seminar4.data.Student;
import ru.geekbrains.ose.Seminar4.data.StudentGroup;
import ru.geekbrains.ose.Seminar4.data.User;

import java.util.List;
import java.util.logging.Logger;

public class UserView {
    /**
     * Принцип единственной ответственности, данный класс выполняет только методы по печати.
     */
    Logger logger = Logger.getLogger(UserView.class.getName());

    public void sendOnConsole(List<User> userList){
        for(User user: userList){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

    public void sendOnConsoleListStudent(List<Student> students){
        logger.info(students.toString());
    }

}