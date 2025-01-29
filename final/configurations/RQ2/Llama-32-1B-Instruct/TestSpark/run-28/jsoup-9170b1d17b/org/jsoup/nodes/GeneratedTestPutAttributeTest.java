package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestPutAttributeTest {

    private Document doc = new Document();

    @Test
    public void testPutAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("attribute", "value");
        System.out.println(attributes.getAttribute("attribute"));
    }

}