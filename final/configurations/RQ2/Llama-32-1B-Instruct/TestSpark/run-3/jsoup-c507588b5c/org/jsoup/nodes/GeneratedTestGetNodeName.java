package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestGetNodeName {

    private String str;

    @Test
    public void testGetNodeName() {
        Document doc = new Document();
        str = "Hello, World!";
        assertEquals("Hello", str.getNodeName());
    }

}