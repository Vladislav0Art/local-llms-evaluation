package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestTextMethod {

    @Test
    public void testTextMethod() {
        Document document = new Document();
        Element element = document.createElement("text");
        element.setText("test");

        TextNode textNode = new TextNode(document, element);
        String text = textNode.text();
        assertEquals("test", text);

        textNode = new TextNode(document, element);
        text = textNode.text();
        assertEquals("test", text);

        textNode = new TextNode(document, element);
        try {
            textNode.text("");
        } catch (Exception e) {
            fail("Failed to throw exception when calling isEmpty() method");
        }
    }

}