package com.epam.engx.drills.calculator;

/**
 * @author Nurmakanov
 */
class StaticMessageSender {

    private StaticMessageSender() {}

    static void send(String message) {
        SleepUtils.sleep(15000);
    }
}
