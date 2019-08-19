package ru.javacourse.lesson4.user.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

    @Id
    @Getter @Setter
    private String id;
    @Getter @Setter
    private String username;
    @Getter @Setter
    private String phone;
    @Getter @Setter
    private String email;

    public User(String username, String phone, String email) {
        this.username = username;
        this.phone = phone;
        this.email = email;
    }


    @Override
    public String toString() {
        return "user{" +
                "username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}

