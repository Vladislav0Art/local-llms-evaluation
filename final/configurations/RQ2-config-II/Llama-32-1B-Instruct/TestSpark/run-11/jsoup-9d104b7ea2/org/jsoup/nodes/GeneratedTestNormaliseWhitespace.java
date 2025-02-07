package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestNormaliseWhitespace {

    @Test
    public void testNormaliseWhitespace() {
        Element element = new Document().createElement("text", "Hello World");
        TextNode node = Mockito.mock(TextNode.class);
        when(node.normaliseWhitespace(Mockito.any(String.class))).thenReturn(""); // Test that normaliseWhitespace() returns the expected value
        assertEquals("", element.normaliseWhitespace(""));
        Mockito.verify(node).normaliseWhitespace();
    }

}