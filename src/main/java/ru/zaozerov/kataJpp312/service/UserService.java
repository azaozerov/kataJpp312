package ru.zaozerov.kataJpp312.service;
import ru.zaozerov.kataJpp312.model.User;

import java.util.List;
public interface UserService {
    void createUser(User user);
    User getNewUser();

    User readUser(Long id);

    void updateUser(User user);

    void deleteUser(Long id);

    List<User> getAllUsers();
}
