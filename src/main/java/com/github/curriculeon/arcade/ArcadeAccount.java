package com.github.curriculeon.arcade;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccount` is registered for each user of the `Arcade`.
 * The `ArcadeAccount` is used to log into the system to select a `Game` to play.
 */
public class ArcadeAccount {
    private String userName;
    private String password;

    public ArcadeAccount(String name, String pass){
        this.userName = name;
        this.password = pass;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }
}
