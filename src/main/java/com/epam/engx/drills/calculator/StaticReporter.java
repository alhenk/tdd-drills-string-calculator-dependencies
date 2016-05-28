package com.epam.engx.drills.calculator;

/**
 * @author Nurmakanov
 */
class StaticReporter {

    private StaticReporter() {}

    static void report(String text)  {
        initReports();
        buildReports();
        writeReports();
    }

    private static void initReports() {
        SleepUtils.sleep(5000);
    }

    private static void buildReports() {
        SleepUtils.sleep(10000);
    }

    private static void writeReports() {
        SleepUtils.sleep(5000);
    }
}
