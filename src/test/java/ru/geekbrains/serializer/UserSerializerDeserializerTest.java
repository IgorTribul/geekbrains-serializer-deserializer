package ru.geekbrains.serializer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.geekbrains.deserializer.JsonUserDeserializer;
import ru.geekbrains.model.User;
import ru.geekbrains.model.UsersCollection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

class UserSerializerDeserializerTest {

    @Test
    public void jsonSerialize() throws IOException, ClassNotFoundException {

        JsonUserSerializer jsonUserSerializer = new JsonUserSerializer();
        jsonUserSerializer.serialize(prepareTestData(), "file.json");

        Assertions.assertNotNull("file.json");

        JsonUserDeserializer jsonUserDeserializer = new JsonUserDeserializer();
        jsonUserDeserializer.deserialize("file.json");

        Assertions.assertEquals(prepareTestData(), jsonUserDeserializer.deserialize("file.json"));


    }
    @Test
    public void xmlSerialize(){

        XmlUserSerializer xmlUserSerializer = new XmlUserSerializer();
        xmlUserSerializer.serialize(prepareTestData(), "file.xml");



    }
    public UsersCollection prepareTestData(){
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

        return users;
    }

}