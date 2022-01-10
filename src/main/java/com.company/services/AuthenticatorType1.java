package main.java.com.company.services;
import main.java.com.company.entities.User;
import java.util.Scanner;

public class AuthenticatorType1 implements Authenticator {

    private AuthenticatorType1(){
        // admin account is automatically created when object is created
        User admin = new User(1,"admin","admin",true);
        userMap.put("admin",admin);
    }

    private static AuthenticatorType1 authObj;

    public static AuthenticatorType1 getInstance(){
        if (authObj == null){
            authObj = new AuthenticatorType1();
        }
        return authObj;
    }

    public User processAuth(String authType) {
        Scanner sc = new Scanner(System.in);

        if (authType.equals("login") | authType.equals("signup")){

            // These two statements are common to both login and signup
            System.out.println("Enter the user id : ");
            String userIdInput = sc.nextLine();

            System.out.println("Enter the password : ");
            String userPassInput = sc.nextLine();

            long luserId = Long.parseLong(userIdInput);

            if (authType.equals("signup")) {

                System.out.println("Enter your address : ");
                String addressInput = sc.nextLine();

                System.out.println("Enter your DOB : ");
                String DOB = sc.nextLine();

                this.signUp(luserId, userPassInput, addressInput, DOB, false);
                return this.signIn(luserId, userPassInput);

            }
            else if (authType.equals("login")) {
                return this.signIn(luserId, userPassInput);

            }

        }
        else{
            System.out.println("INVALID OPTION! TRY AGAIN!");
        }
        return null;

    }


    public void signUp(long userId, String userPass, String address, String dateOfBirth, Boolean isAdmin) {
        System.out.println("New account created for " + userId);
        User userObj = new User(userId, address, dateOfBirth, isAdmin);
        userMap.put(userId + userPass, userObj);

    }

    public User signIn(long userId, String userPass) {

        boolean access = userMap.containsKey(userId + userPass);

        if (userId == 1 && userPass.equals("admin")){
            return userMap.get("admin");
        }

        else if (access) {
            System.out.println("Welcome " + userId);
            return userMap.get(userId+userPass);
        } else {
            System.out.println("No account found with Id " + userId);
            return null;
        }
    }
}
