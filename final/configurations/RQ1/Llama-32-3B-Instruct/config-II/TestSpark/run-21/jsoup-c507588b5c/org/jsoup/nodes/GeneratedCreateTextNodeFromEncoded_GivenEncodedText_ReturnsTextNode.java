package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCreateTextNodeFromEncoded_GivenEncodedText_ReturnsTextNode {

    @Test
    public void createTextNodeFromEncoded_GivenEncodedText_ReturnsTextNode() {
        // Given
        String encodedText = "&lt;Hello World&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        // When
        String unescapedValue = textNode.value();

        // Then
        assertEquals("Hello World", unescapedValue);
    }

}