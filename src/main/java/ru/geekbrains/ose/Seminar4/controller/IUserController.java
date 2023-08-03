package ru.geekbrains.ose.Seminar4.controller;

import ru.geekbrains.ose.Seminar4.data.User;

public interface IUserController <T extends User>{
    /**
     * Принцип единственной ответственности, данный интерфейс выполняет только одну функцию создать юзера.
     * Принцип разделения интерфейса (ISP)
     */
    void create(String firstName, String surName, String lastName);
}