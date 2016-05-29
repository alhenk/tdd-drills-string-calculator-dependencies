package com.epam.engx.drills.calculator;

import java.io.File;

/**
 * @author Nurmakanov
 */
public class FactoryMethodItemProcessor {

    private final FactoryMethodItemParser parser;

    public FactoryMethodItemProcessor() {
        File file = new File("C:\\file.xml");
        this.parser = new FactoryMethodItemParser(file);
    }

    public void process() {
        for (int i = 0; i < 10; i++) {
            FactoryMethodItem item = parser.parse();
            System.out.println(item);
        }
    }
}


