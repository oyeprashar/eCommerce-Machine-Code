package main.java.com.company.services;
import main.java.com.company.entities.Cart;
import main.java.com.company.entities.User;
import main.java.com.company.entities.Warehouse;
import java.util.Scanner;

public class ECommerce {

    private ECommerce(){};
    private static ECommerce startObj;

    public static ECommerce getInstance(){
        if (startObj == null){
            startObj = new ECommerce();
        }
        return startObj;
    }

    public static void startApp() {

        // create objects of services
        Warehouse w1 = Warehouse.getInstance();
        TransactionProcessorType1 tProcessor = TransactionProcessorType1.getInstance();
        CmdProcessor cmdProcessor1 = CmdProcessor.getInstance();
        AuthenticatorType1 auth = AuthenticatorType1.getInstance();

        // variables to track the current user
        boolean loggedIn = false;
        User currUser = null;
        Cart currCart = null;

        // loop to take the input and process them
        while (true) {

            Scanner sc = new Scanner(System.in);

            while (!loggedIn) {

                System.out.println("Do you want to signup or login?");
                String authType = sc.nextLine();

                currUser = auth.processAuth(authType);

                if (currUser != null) {
                    loggedIn = true;
                    currCart = new Cart();
                }
            }

            String cmd = sc.nextLine();
            // converting the input to lower case to avoid case-sensitive mistakes
            cmd = cmd.toLowerCase();

            if (cmd.equals("exit")){
                break;
            }

            else if (cmd.equals("logout")){
                System.out.println("User logged out!");
                loggedIn = false;
            }

            else{
                cmdProcessor1.process(cmd,w1,tProcessor,currCart,currUser);
            }
        }
        System.out.println("Thank you for shopping with us!");
    }
}
