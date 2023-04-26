package com.mycompany.app;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import primer.po.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        JAXBContext jc = JAXBContext.newInstance("primer.po");
        Unmarshaller u = jc.createUnmarshaller();
        PurchaseOrder po = (PurchaseOrder) u.unmarshal(new FileInputStream("po.xml"));

        Marshaller m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(po, System.out);

        System.out.println("Hello World!");
    }
}
