package main.java.edu.eci.arsw.acount.service;
public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}