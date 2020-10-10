package ru.geekbrains.serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.geekbrains.model.User;
import ru.geekbrains.model.UsersCollection;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class JsonUserSerializer implements UserSerializer {

    public void serialize(UsersCollection users, String filename){

        ObjectMapper mapper = new ObjectMapper();
        File file = new File(filename);
        try {
            mapper.writerFor(UsersCollection.class).writeValue(file, users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
