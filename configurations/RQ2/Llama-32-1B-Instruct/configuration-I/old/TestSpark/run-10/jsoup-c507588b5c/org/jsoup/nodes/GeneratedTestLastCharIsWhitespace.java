package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestLastCharIsWhitespace {

    public static Document createNode(String name, String[] attributes) {
        return new Document();
    }

    @Test
    public void testLastCharIsWhitespace() {
        Document doc = createNode("text", new String[]{"class", "test"});
        Element element = (Element) doc.getElementById("test");
        String result2 = element.lastCharIsWhitespace().trim();
        assertTrue(result2.equals(""));
    }

}