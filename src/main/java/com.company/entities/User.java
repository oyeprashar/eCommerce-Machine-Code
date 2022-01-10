package main.java.com.company.entities;

public class User {

    public long userId;
    private String address;
    private String dateOfBirth;
    public boolean isAdmin = false;
    private Cart currCart = new Cart();

    public User(long userId, String address, String dateOfBirth, boolean isAdmin) {
        this.userId = userId;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.isAdmin = isAdmin;
    }

}
