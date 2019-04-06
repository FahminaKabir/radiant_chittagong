package com.example.personal.radiantchittagong;

/**
 * Created by Personal on 2/5/2018.
 */

public class LoginItems {
    String password;
    String username;
    int ID;




    public LoginItems(String username, String password){
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return ID;
    }
    public void setId(int ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
