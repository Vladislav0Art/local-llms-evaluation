package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSplitWholeText_TextNodeContentsUnchanged {

    @Test
    public void splitWholeText_TextNodeContentsUnchanged() {
        // Given
        String originalText = "Hello World";

        TextNode textNode = new TextNode(originalText);

        // When
        String wholeText = textNode.getWholeText();

        // Then
        assertEquals(originalText, wholeText);
    }

}