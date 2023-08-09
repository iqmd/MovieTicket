package com.movieticket.controller;
import com.movieticket.model.*;

import java.util.Scanner;

public class Login {

    private Database database;
    private String username;
    private String pass;
    private User user;

    Scanner read = new Scanner(System.in);

    public Login(Database database){
        this.database = database;
    }

    public void display(){
        System.out.println("User : ");
        username = read.nextLine();
        System.out.println("Password : ");
        pass = read.nextLine();

        user = getUser();
        if(user == null){
            System.out.println("User not registered !!");
        }else{
            if(checkPassword(user,pass)){
                System.out.println("Login Successful");
                System.out.println("Welcome "+user.getFirstName());
            }else{
                System.out.println("Password Incorrect");
            }
        }
    }

    public User getUser(){
        return database.getUserFromLoginId(username);
    }


    public boolean checkPassword(User user,String password){
        if(user.getPassword().equals(password)){
            return true;
        }else{
            return false;
        }
    }


}
