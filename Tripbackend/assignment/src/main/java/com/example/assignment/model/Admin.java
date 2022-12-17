package com.example.assignment.model;

import javax.persistence.*;

@Entity
@Table
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    private String UserName;
    private String FullName;
    private String EmailOfAdmin;
    private String AdminPassword;

    public Admin(){}
    public Admin(String userName, String fullName,String emailOfAdmin, String adminPassword){

        UserName = userName;
        FullName =fullName;
        EmailOfAdmin=emailOfAdmin;
        AdminPassword=adminPassword;

    }
    public void setUserName(String userName)
    {
        this.UserName = userName;
    }

    public String getUserName() {
        return UserName;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getEmailOfAdmin() {
        return EmailOfAdmin;
    }

    public void setEmailOfAdmin(String emailOfAdmin) {
        EmailOfAdmin = emailOfAdmin;
    }

    public String getAdminPassword() {
        return AdminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        AdminPassword = adminPassword;
    }
    public long getID() {
        return ID;
    }

    public void setID(long id) {
        this.ID = id;
    }

}

