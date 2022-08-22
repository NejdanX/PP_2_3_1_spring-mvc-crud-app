package web.service;


import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;

@Service
public interface UserService {

    public void saveUser(User user);

    public void updateUser(User user);

    public void deleteUser(long id);

    public List<User> getAllUsers();

    public User findUserById(long id);
}
