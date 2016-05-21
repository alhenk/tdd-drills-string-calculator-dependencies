package com.epam.engx.drills.calculator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nurmakanov on 21.05.2016.
 */
public class SignUpServiceWithStaticCalls {

    private List<RegisteredUser> users = new ArrayList<>();

    public void signUp(String user, String pass) {
        users.add(new RegisteredUser(user, pass));
        StaticReporter.report("user added" + user + pass);
    }

    public Boolean isRegistered(String user, String pass) {
        for (RegisteredUser item : users) {
            if (item.getUsername() == user && item.getPassword() == pass) {
                return true;
            }
        }
        return false;
    }
}
