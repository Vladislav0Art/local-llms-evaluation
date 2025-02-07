package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestText {

    @Test
    public void testText() {
        Element element = new Document().createElement("text", "Hello World");
        TextNode node = Mockito.mock(TextNode.class);
        when(node.text()).thenReturn("World"); // Test that text() returns the expected value
        assertEquals("World", element.getText());
        Mockito.verify(node).text();
    }

}