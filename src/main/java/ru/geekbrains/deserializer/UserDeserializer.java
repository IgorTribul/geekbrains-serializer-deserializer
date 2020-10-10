package ru.geekbrains.deserializer;

import ru.geekbrains.model.User;
import ru.geekbrains.model.UsersCollection;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

public interface UserDeserializer {

     UsersCollection deserialize(String filename) throws IOException, ClassNotFoundException;
}
