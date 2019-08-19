package ru.javacourse.lesson4.user.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import ru.javacourse.lesson4.user.model.User;

import java.util.List;

@Service
public class UserRepositoryCustomImpl implements UserRepositoryCustom {
    private final ObjectMapper objectMapper;
    @Autowired
    private MongoTemplate mongoTemplate;

    public UserRepositoryCustomImpl(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
    public List<User> findByName(String name){
        return mongoTemplate.find(Query.query(Criteria.where("username").regex(name)), User.class);
    }
}
