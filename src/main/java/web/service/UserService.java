package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;

@Service
public interface UserService {

    List<User> getAllUsers();

    User getUser(Long id);

    void saveOrUpdateUser(User user);

    void deleteUser(Long id);
}