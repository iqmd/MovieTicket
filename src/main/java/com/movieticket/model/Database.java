package com.movieticket.model;

import java.util.HashMap;

public class Database{

    private HashMap<String,User> keyLoginId = new HashMap<>();
    private HashMap<String,User> keyEmailId = new HashMap<>();

    public Database(){}

    public int addUser(User user){
        if(keyLoginId.containsKey(user.getLoginId()) || keyEmailId.containsKey(user.getEmailId())){
           return 0;
        }else{
            keyLoginId.put(user.getLoginId(),user);
            keyEmailId.put(user.getEmailId(),user);
            return 1;
        }
    }


    public User getUserFromLoginId(String login){
        if(keyLoginId.containsKey(login)){
           return keyLoginId.get(login);
        }else{
            return null;
        }
    }


    public User getUserFromEmailId(String email){
        if(keyEmailId.containsKey(email)){
           return keyEmailId.get(email);
        }else{
            return null;
        }
    }

}
