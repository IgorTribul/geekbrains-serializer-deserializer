package ru.geekbrains.deserializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.json.JsonMapper;
import ru.geekbrains.model.User;
import ru.geekbrains.model.UsersCollection;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class JsonUserDeserializer implements UserDeserializer {


    public UsersCollection deserialize(String filename) throws IOException, ClassNotFoundException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(filename);
        Object o = mapper.readerFor(UsersCollection.class).readValue(file, UsersCollection.class);
        UsersCollection users = (UsersCollection) o;
        return users;
    }
}
