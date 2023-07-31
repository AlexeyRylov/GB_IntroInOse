package ru.geekbrains.ose.HomeWork03.comparator;

import ru.geekbrains.ose.HomeWork03.module.Steam;
import java.util.Comparator;

public class SteamComparator implements Comparator<Steam> {
    @Override
    public int compare(Steam o1, Steam o2) {
        return o1.getSteamSize().compareTo(o2.getSteamSize());
    }
}
