package ru.geekbrains.serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import ru.geekbrains.model.User;
import ru.geekbrains.model.UsersCollection;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class CsvUserSerializer implements UserSerializer{

    public void serialize(UsersCollection users, String filename){
//
//        File file = new File(filename);
//        ObjectMapper mapper = new CsvMapper();
//        try {
//            mapper.writerFor(UsersCollection.class).writeValue(file,users);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

}
