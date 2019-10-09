package edu.eci.arsw.acount.service;
import edu.eci.arsw.acount.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}