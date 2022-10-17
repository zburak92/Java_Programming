package day11_StringCont;

import java.util.Scanner;

public class WuLogin {

    public static void main(String[] args) {


        String correctUsername = "Cydeo",
                correctPassword = "WoodenSpoon";

        Scanner input = new Scanner(System.in);

        System.out.println("ENter your Username:");
        String username = input.next();

        System.out.println("Enter Password:");
        String password = input.next();
        input.close();

        if(username.equals(correctUsername) && password.equals(correctPassword)){

            System.out.println("You are signed on.");

        }else{
            System.err.println("Incorrect username or password.");
        }


    }

}
