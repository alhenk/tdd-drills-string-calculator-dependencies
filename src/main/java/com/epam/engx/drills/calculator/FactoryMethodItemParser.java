package com.epam.engx.drills.calculator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * @author Nurmakanov
 */
class FactoryMethodItemParser {

    private File source;
    private Unmarshaller jaxbUnmarshaller;

    FactoryMethodItemParser(File source) {
        this.source = source;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(FactoryMethodItem.class);
            jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    FactoryMethodItem parse() {
        try {
            return (FactoryMethodItem) jaxbUnmarshaller.unmarshal(source);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
