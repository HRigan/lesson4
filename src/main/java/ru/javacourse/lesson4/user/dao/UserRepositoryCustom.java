package ru.javacourse.lesson4.user.dao;

import ru.javacourse.lesson4.user.model.User;

import java.util.List;

public interface UserRepositoryCustom {

    List<User> findByName(String lastName);
}
