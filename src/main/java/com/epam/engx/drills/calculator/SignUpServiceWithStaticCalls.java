package com.epam.engx.drills.calculator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nurmakanov on 21.05.2016.
 */
class SignUpServiceWithStaticCalls {

    private List<RegisteredUser> users = new ArrayList<>();

    public void signUp(String user, String pass) {
        users.add(new RegisteredUser(user, pass));
    }

    Boolean isRegistered(String user, String pass) {
        try {
            StaticReporter.report("Checking registration for" + user + " and " + pass);
        } catch (Exception e) {//too bad
            StaticMessageSender.send("Exception:" + e.getMessage());
        }
        for (RegisteredUser item : users) {
            if (item.getUsername().equals(user) && item.getPassword().equals(pass)) {
                return true;
            }
        }
        return false;
    }
}
