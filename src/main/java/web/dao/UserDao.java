package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUser();

    User getUser(Long id);

    void saveOrUpdateUser(User user);

    void deleteUser(Long id);

}