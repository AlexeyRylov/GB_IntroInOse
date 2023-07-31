package ru.geekbrains.ose.HomeWork03.service;

import ru.geekbrains.ose.HomeWork03.comparator.SteamComparator;
import ru.geekbrains.ose.HomeWork03.module.Steam;
import ru.geekbrains.ose.HomeWork03.module.SteamGroup;

import java.util.ArrayList;
import java.util.List;

public class SteamService {
    private SteamGroup steamGroup;
    public List<Steam> getSortedSteam(){
        List<Steam> steamList = new ArrayList<>(steamGroup.getStudentSteam());
        steamList.sort(new SteamComparator());
        return steamList;
    }
}
