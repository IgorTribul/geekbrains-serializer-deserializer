package ru.geekbrains.serializer;
import ru.geekbrains.model.User;
import ru.geekbrains.model.UsersCollection;

import java.util.Collection;

public interface UserSerializer {

    void serialize (UsersCollection users, String filename);
}
