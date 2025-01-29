package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    public static Document createDocument() {
        return new Document();
    }

    public static Element addElement(String name, String value) {
        return createDocument().addElement(name);
    }

    public static int getNumberOfElements(Document doc) {
        return (int) doc.getNumberOfChildren();
    }

}