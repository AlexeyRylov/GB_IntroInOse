package ru.geekbrains.ose.Seminar4;

import ru.geekbrains.ose.Seminar3.InterfaceIterator.Student;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2){
        int resultOfComaring = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComaring == 0){
            resultOfComaring = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComaring == 0){
                return o1.getLastName().compareTo(o2.getLastName());
            } else {
                return resultOfComaring;
                }
        } else {
            return resultOfComaring;
            }
    }
}

