package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCreateTextNode_TextNodeCreatedCorrectly {

    @Test
    public void createTextNode_TextNodeCreatedCorrectly() {
        // Given
        String text = "Hello World";

        // When
        TextNode textNode = new TextNode(text);

        // Then
        assertNotNull(textNode);
        assertEquals("#text", textNode.nodeName());
        assertEquals(text, textNode.text());
    }

}