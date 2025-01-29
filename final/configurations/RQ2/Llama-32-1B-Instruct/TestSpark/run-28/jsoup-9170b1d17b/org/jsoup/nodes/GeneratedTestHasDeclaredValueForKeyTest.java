package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestHasDeclaredValueForKeyTest {

    private Document doc = new Document();

    @Test
    public void testHasDeclaredValueForKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        System.out.println(attributes.hasDeclaredValueForKey("key"));
    }

}