package web.services;

import web.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void createUser(User user);
    void updateUser(Long id, User user);
    void deleteUser(Long id);
}
