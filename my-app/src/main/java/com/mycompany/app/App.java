package com.mycompany.app;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try {
            File inputFile = new File("../c172p.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getChildNodes();
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nChild :" + nNode.getNodeName());
                NodeList n = nNode.getChildNodes();
                for (int i = 0; i < n.getLength(); i++) {
                    Node nnNode = n.item(i);
                    System.out.println("    " + i + "  " + nnNode.getNodeName());
                    NodeList nn = nnNode.getChildNodes();
                    for (int j = 0; i < nn.getLength(); j++) {
                        Node nnnNode = nn.item(j);
                        if (nnnNode != null) {
                            System.out.println("     " + j + "  " + nnnNode.getNodeName());
                        }
                    }
                }
            }
            /*
             * NodeList nList = doc.getElementsByTagName("student");
             * System.out.println("----------------------------");
             * 
             * for (int temp = 0; temp < nList.getLength(); temp++) {
             * Node nNode = nList.item(temp);
             * System.out.println("\nCurrent Element :" + nNode.getNodeName());
             * 
             * if (nNode.getNodeType() == Node.ELEMENT_NODE) {
             * Element eElement = (Element) nNode;
             * System.out.println("Student roll no : "
             * + eElement.getAttribute("rollno"));
             * System.out.println("First Name : "
             * + eElement
             * .getElementsByTagName("firstname")
             * .item(0)
             * .getTextContent());
             * System.out.println("Last Name : "
             * + eElement
             * .getElementsByTagName("lastname")
             * .item(0)
             * .getTextContent());
             * System.out.println("Nick Name : "
             * + eElement
             * .getElementsByTagName("nickname")
             * .item(0)
             * .getTextContent());
             * System.out.println("Marks : "
             * + eElement
             * .getElementsByTagName("marks")
             * .item(0)
             * .getTextContent());
             * }
             * }
             */
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Hello World!");
    }
}
