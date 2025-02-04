package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCreateTextNode_GivenRawText_ReturnsTextNodeWithCorrectValue {

    @Test
    public void createTextNode_GivenRawText_ReturnsTextNodeWithCorrectValue() {
        // Given
        String text = "Hello World";

        // When
        TextNode textNode = new TextNode(text);

        // Then
        assertEquals(text, textNode.value());
    }

}