package org.example;

import org.example.account.AccountService;
import org.example.user.UserService;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OperationConsoleListener {

    private final Scanner scanner;
    private final UserService userService;
    private final AccountService accountService;

    public OperationConsoleListener(Scanner scanner,
                                    UserService userService,
                                    AccountService accountService) {
        this.scanner = scanner;
        this.userService = userService;
        this.accountService = accountService;
    }

    public void listenUpdates(){
        System.out.println("Please type operations:\n");
        while(true){
            System.out.println("Please next type operations:\n");
            String nextOperation = scanner.nextLine();
            if (nextOperation.equals("USER_CREATE")){
                System.out.println("user_created\n");
            } else if(nextOperation.equals("ACCOUNT_CREATE")) {
                System.out.println("account_created\n");
            } else {
                System.out.println("not found operation\n");
            }
        }
    }
}