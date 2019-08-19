package ru.javacourse.lesson4;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Configuration
public class MongoConfiguration extends AbstractMongoConfiguration {

    @Override
    @Bean
    public MongoClient mongoClient() {
        return new MongoClient("127.0.0.1",27017);
    }

    @Override
    protected String getDatabaseName() {
        return "DBUsers";
    }

}