package com.movieticket.view;
import com.movieticket.model.*;
import  com.movieticket.controller.*;

import java.util.Scanner;

public class Dashboard {

    Scanner read = new Scanner(System.in);

    public Dashboard(){

    }

    public void banner(){
        System.out.println("Welcome to MovieTickets");
    }

    public void display(int choice){
        if(choice == 0){
            System.out.println("Do you want to Login(1)/Register(2)? 1 or 2");
            choice = Integer.parseInt(read.nextLine());
            display(choice);
        }else if(choice == 1){
           loginPage();
        }else if(choice == 2){
           registerPage();
        }else{
            System.out.println("Please Enter a Valid choice !!");
            display(0);
        }

    }

    public void loginPage(){
        Login login = new Login();
        login.display();
    }

    public void registerPage(){
        Register register = new Register();
        register.userForm();
        display(0);
    }
}
