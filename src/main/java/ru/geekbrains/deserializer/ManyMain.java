package ru.geekbrains.deserializer;

import ru.geekbrains.model.User;
import ru.geekbrains.model.UsersCollection;
import ru.geekbrains.serializer.CsvUserSerializer;
import ru.geekbrains.serializer.JsonUserSerializer;
import ru.geekbrains.serializer.XmlUserSerializer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;


public class ManyMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User userOne = new User();
        userOne.setId(1);
        userOne.setName("Ivan");
        userOne.setEmale("ivan@bk.ru");

        User userTwo = new User();
        userTwo.setId(2);
        userTwo.setName("Peter");
        userTwo.setEmale("peter@bk.ru");

        User userTree = new User();
        userTree.setId(3);
        userTree.setName("Pavel");
        userTree.setEmale("pavel@bk.ru");

        Collection<User> collection = new ArrayList<User>();
        collection.add(userOne);
        collection.add(userTwo);
        collection.add(userTree);
        UsersCollection users = new UsersCollection();
        users.setUsers(collection);

        System.out.println(users);

        JsonUserSerializer jsonUserSerializer = new JsonUserSerializer();
        jsonUserSerializer.serialize(users, "file.json");
        JsonUserDeserializer jsonUserDeserializer = new JsonUserDeserializer();
        System.out.println(users == jsonUserDeserializer.deserialize("file.json"));
        System.out.println(jsonUserDeserializer.deserialize("file.json"));


        XmlUserSerializer xmlUserSerializer = new XmlUserSerializer();
        xmlUserSerializer.serialize(users, "file_two.xml");

        CsvUserSerializer csvUserSerializer = new CsvUserSerializer();
        csvUserSerializer.serialize(users, "file_tree.csv");
    }
}
