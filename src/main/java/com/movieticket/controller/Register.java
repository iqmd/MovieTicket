package com.movieticket.controller;
import com.movieticket.model.*;
import java.util.Scanner;


public class Register{
    private User user = new User();

    private Database database;

    public Register(Database database){
        this.database = database;
    }

    public void addUser(){
        int success = database.addUser(user);
        if(success == 0){
           System.out.println("LoginId or Email Already in use , pls try something different !!");
        }else{
            System.out.println("Successfully Registered !!");
        }
    }


    public String takeInput(String field){
        Scanner read = new Scanner(System.in);
        String answer;
        System.out.println(field);
        answer = read.nextLine();
        // read.close();
        return answer;
    }

    public void userForm(){
        System.out.println("Please fill out the form to Register");

        String value;

        value = takeInput("FirstName :");
        user.setFirstName(value);

        value = takeInput("Last Name :");
        user.setLastName(value);

        value = takeInput("LoginId :");
        user.setLoginId(value);

        value = takeInput("Password :");
        user.setPassword(value);

        value = takeInput("Confirm Password :");

        while(!user.getPassword().equals(value)){
            System.out.println("Password does not match !!");
            value = takeInput("Confirm Password :");

        }
        user.setConfirmPassword(value);


        value = takeInput("Contact Number :");
        user.setContactNumber(value);


        value = takeInput("Email Id :");
        user.setEmailId(value);


        addUser();
    }
}
