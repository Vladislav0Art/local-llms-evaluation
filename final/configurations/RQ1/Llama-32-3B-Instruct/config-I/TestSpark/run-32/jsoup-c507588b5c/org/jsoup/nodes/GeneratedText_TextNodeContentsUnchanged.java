package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedText_TextNodeContentsUnchanged {

    @Test
    public void text_TextNodeContentsUnchanged() {
        // Given
        String originalText = "Hello World";

        TextNode textNode = new TextNode(originalText);

        // When
        String newText = textNode.text();

        // Then
        assertEquals(originalText, newText);
    }

}