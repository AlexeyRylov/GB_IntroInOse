package ru.geekbrains.ose.HomeWork03.iterator;

import ru.geekbrains.ose.HomeWork03.module.Steam;
import ru.geekbrains.ose.HomeWork03.module.Student;
import ru.geekbrains.ose.HomeWork03.module.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class SteamIterator implements Iterator<StudentGroup> {
    private int count;
    private final List<StudentGroup> studentSteam;

    public SteamIterator(Steam steam) {
        this.count = 0;
        this.studentSteam = steam.getStudentSteam();
    }


    @Override
    public boolean hasNext() {
        return count < studentSteam.size() - 1;
    }

    @Override
    public StudentGroup next() {
        if(!hasNext()){
            return null;
        }
        count++;
        return studentSteam.get(count);
    }
}
