package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

public class GeneratedGetAttributes {

    @Test
    public void getAttributes() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("html.html");
        Element root = document.body();
        String content1 = "<p>This is a test</p>";
        String content2 = "<p>This is another test</p>";

        Attributes attributes = new Attributes();

        attributes.addAttribute("test", content1);
        attributes.addAttribute("another-test", content2);

        assertTrue(attributes.containsKey("test"));
        assertFalse(attributes.containsValue(content1));

        attributes.removeAttribute("another-test");
        assertTrue(attributes.containsKey("test"));

        assertTrue(attributes.getValue("test").equals(content1));
    }

}