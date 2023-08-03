package ru.geekbrains.ose.Seminar4.controller;
import ru.geekbrains.ose.Seminar4.data.User;

import java.time.LocalDate;

public class UserController implements IUserController{
    /**
     * Принцип единственной ответственности, данный класс выполняет только одну функцию создать юзера.
     */
    @Override
    public void create(String firstName, String surName, String lastName){
        User newUser = new User(firstName, lastName, surName, LocalDate.now());
    }
    public void printConsole(User user){

    }
}
