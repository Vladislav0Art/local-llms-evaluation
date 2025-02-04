package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetWholeText_GivenTextNode_ReturnsTextNodeValue {

    @Test
    public void getWholeText_GivenTextNode_ReturnsTextNodeValue() {
        // Given
        TextNode textNode = new TextNode("Hello World");

        // When
        String wholeText = textNode.getWholeText();

        // Then
        assertEquals("Hello World", wholeText);
    }

}