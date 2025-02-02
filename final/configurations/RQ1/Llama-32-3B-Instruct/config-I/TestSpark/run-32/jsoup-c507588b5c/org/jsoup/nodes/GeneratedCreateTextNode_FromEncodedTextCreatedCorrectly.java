package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCreateTextNode_FromEncodedTextCreatedCorrectly {

    @Test
    public void createTextNode_FromEncodedTextCreatedCorrectly() {
        // Given
        String encodedText = "&lt;Hello&gt; World";

        // When
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        // Then
        assertNotNull(textNode);
        assertEquals("#text", textNode.nodeName());
        assertEquals("Hello World", textNode.text());
    }

}