package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestIteratorTest {

    private Document doc = new Document();

    @Test
    public void testIteratorTest() {
        Attributes attributes = new Attributes();
        for (Attribute attribute : attributes.iterator()) {
            System.out.println(attribute.getKey());
        }
    }

}