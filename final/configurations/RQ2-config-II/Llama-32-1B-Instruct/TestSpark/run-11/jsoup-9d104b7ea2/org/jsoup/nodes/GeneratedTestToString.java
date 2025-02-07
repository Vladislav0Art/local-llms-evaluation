package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        Element element = new Document().createElement("text", "Hello World");
        TextNode node = Mockito.mock(TextNode.class);
        when(node.toString()).thenReturn("Hello World"); // Test that toString() returns the expected value
        assertEquals("Hello World", element.toString());
        Mockito.verify(node).toString();
    }

}