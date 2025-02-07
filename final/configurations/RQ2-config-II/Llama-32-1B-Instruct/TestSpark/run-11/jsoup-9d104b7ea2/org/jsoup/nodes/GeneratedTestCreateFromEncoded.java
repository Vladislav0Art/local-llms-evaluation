package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestCreateFromEncoded {

    @Test
    public void testCreateFromEncoded() {
        String encodedText = "Hello World";
        TextNode node = TextNode.createFromEncoded(encodedText);
        Mockito.when(Mockito.any(TextNode.class)).thenReturn(node); // Test that createFromEncoded() returns the expected value
        assertEquals("Hello World", node.text());
        Mockito.verify(node).text();
    }

}