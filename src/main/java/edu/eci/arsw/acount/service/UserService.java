package main.java.edu.eci.arsw.acount.service;
import main.java.edu.eci.arsw.acount.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}