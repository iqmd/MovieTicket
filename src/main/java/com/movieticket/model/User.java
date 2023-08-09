package com.movieticket.model;

public class User {

    private String FirstName;
    private String LastName;
    private String LoginId;
    private String Password;
    private String ConfirmPassword;
    private String ContactNumber;
    private String EmailId;



    //getter and Setters
    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public String getLoginId() {
        return LoginId;
    }
    public void setLoginId(String loginId) {
        LoginId = loginId;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public String getConfirmPassword() {
        return ConfirmPassword;
    }
    public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword = confirmPassword;
    }
    public String getContactNumber() {
        return ContactNumber;
    }
    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        EmailId = emailId;
    }

}
