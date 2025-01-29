package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestAddAllTest {

    private Document doc = new Document();

    @Test
    public void testAddAllTest() {
        Attributes attributes1 = new Attributes();
        attributes1.addUser("value1");
        Element element1 = doc.createElement("key1");
        element1.appendChild(attributes1.getUserNode());
        for (Element element : elements) {
            System.out.println(element.get("key"));
        }
    }

}