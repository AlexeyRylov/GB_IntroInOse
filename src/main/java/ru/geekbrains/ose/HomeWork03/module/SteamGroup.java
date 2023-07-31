package ru.geekbrains.ose.HomeWork03.module;

import ru.geekbrains.ose.HomeWork03.iterator.StudentGroupIterator;

import java.util.Iterator;
import java.util.List;

public class SteamGroup {
    private List<Steam> steamList;

    public List<Steam> getStudentSteam() {
        return steamList;
    }

    public SteamGroup(List<Steam> steamList) {
        this.steamList = steamList;
    }

    /*@Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }*/
}
