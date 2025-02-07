package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        Element element = new Document().createElement("text", "Hello World");
        TextNode node = Mockito.mock(TextNode.class);
        when(node.clone()).thenReturn(new TextNode(element.getText())); // Test that clone() creates a new TextNode with the correct text
        assertEquals("Hello World", node.getText());
        Mockito.verify(node).clone();
    }

}