package ru.javacourse.lesson4.user.service;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.javacourse.lesson4.user.model.User;
import ru.javacourse.lesson4.user.repository.UserRepository;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    private final UserRepository repository;
    private final ObjectMapper objectMapper;
    @Autowired
    public UserService(UserRepository repository, ObjectMapper objectMapper) {
        this.repository = repository;
        this.objectMapper = objectMapper;
    }

    @PostConstruct
    private void init(){
        repository.save(new User("A","900","a@a"));
        repository.save(new User("B","800","b@b"));
        repository.save(new User("C","700","c@c"));
        repository.save(new User("D","600","d@d"));
        repository.save(new User("E","500","e@e"));
    }

    public List<User> getAllUser(){
        return repository.findAll();
    }
    public List<User> getUser(JsonNode name){
        Map<String, String> result = objectMapper.convertValue(name, Map.class);
        System.out.println(result.get("name"));
        return repository.findByName(result.get("name"));
    }

}
