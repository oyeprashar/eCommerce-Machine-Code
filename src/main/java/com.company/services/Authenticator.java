package main.java.com.company.services;
import main.java.com.company.entities.User;
import java.util.HashMap;

interface Authenticator {

    HashMap<String, User> userMap = new HashMap<>();
    void signUp(long userId, String userPass, String address, String dateOfBirth, Boolean isAdmin);
    User signIn(long userId, String userPass);
}
