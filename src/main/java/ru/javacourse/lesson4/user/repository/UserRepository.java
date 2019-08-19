package ru.javacourse.lesson4.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.javacourse.lesson4.user.dao.UserRepositoryCustom;
import ru.javacourse.lesson4.user.model.User;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String>, UserRepositoryCustom {

    List<User> findAll();

}
