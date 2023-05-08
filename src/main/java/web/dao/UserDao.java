package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    void remove(int id);

    void update(User user);

    List<User> getAllUsers();
}
