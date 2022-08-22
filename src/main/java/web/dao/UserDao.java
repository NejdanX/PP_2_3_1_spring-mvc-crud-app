package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;

@Repository
public interface UserDao {

    public void saveUser(User user);

    public void updateUser(User user);

    public void deleteUser(long id);

    public List<User> getAllUsers();

    public User findUserById(long id);
}
