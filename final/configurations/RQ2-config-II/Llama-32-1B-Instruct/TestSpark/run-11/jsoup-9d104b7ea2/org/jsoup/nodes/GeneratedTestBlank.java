package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestBlank {

    @Test
    public void testBlank() {
        Element element = new Document().createElement("text", "Hello World");
        TextNode node = Mockito.mock(TextNode.class);
        when(node.isBlank()).thenReturn(true); // Test that isBlank() returns the expected value
        assertEquals(true, element.getText().equals(""));
        Mockito.verify(node).isBlank();
    }

}