package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestNormaliseWhitespace {

    public static Document createNode(String name, String[] attributes) {
        return new Document();
    }

    @Test
    public void testNormaliseWhitespace() {
        Document doc = createNode("div", new String[]{"class", "test"});
        Element element = (Element) doc.getElementById("test");
        String result1 = isBlank(element.text().trim());
        assertTrue(result1.equals(""));
    }

}