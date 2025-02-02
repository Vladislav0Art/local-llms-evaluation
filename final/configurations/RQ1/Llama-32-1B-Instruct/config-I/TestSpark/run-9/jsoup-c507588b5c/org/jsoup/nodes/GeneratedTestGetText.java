package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestGetText {

    @Test
    public void testGetText() {
        Document doc = new Document();
        Element textNode = doc.createElement("text");
        textNode.appendChild(doc.createTextNode(""));
        TextNode textNode2 = new TextNode(textNode);
        assertEquals("", textNode2.getText());

        String text = "Hello";
        textNode = doc.createElement("text");
        textNode.appendChild(doc.createTextNode(text));
        TextNode textNode3 = new TextNode(textNode);
        assertEquals(text, textNode3.getText());
    }

}