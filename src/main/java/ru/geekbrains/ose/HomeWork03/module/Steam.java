package ru.geekbrains.ose.HomeWork03.module;

import ru.geekbrains.ose.HomeWork03.iterator.SteamIterator;
import ru.geekbrains.ose.HomeWork03.iterator.StudentGroupIterator;

import java.util.Iterator;
import java.util.List;

public class Steam implements Iterable<StudentGroup>{
    private List<StudentGroup> studentSteam;

    public List<StudentGroup> getStudentSteam() {
        return studentSteam;
    }
    public Integer getSteamSize() {return studentSteam.size(); }
    public Steam(List<StudentGroup> studentSteam) {
        this.studentSteam = studentSteam;
    }
    @Override
    public Iterator<StudentGroup> iterator() {
        return new SteamIterator(this);
    }


}
