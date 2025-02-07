package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTest.

nodeName {

    @Test
    public void test.nodeName() {
        Element element = new Document().createElement("text", "Hello World");
        TextNode node = Mockito.mock(TextNode.class);
        when(node.nodeName()).thenReturn("text"); // Test that nodeName() returns the expected value
        assertEquals("text", element.nodeName());
        Mockito.verify(node).nodeName();
    }

}