package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestTextConstructor {

    @Test
    public void testTextConstructor() {
        Element element = new Document().createElement("text", "Hello World");
        TextNode node = new TextNode(element.toString()); // Test that text() creates a new TextNode with the correct text
        assertEquals("Hello World", element.getText());
        Mockito.verify(element).setText(node.text());
    }

}