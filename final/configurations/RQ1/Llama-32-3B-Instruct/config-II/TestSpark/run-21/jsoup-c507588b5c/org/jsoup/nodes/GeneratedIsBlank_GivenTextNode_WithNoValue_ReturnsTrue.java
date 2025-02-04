package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsBlank_GivenTextNode_WithNoValue_ReturnsTrue {

    @Test
    public void isBlank_GivenTextNode_WithNoValue_ReturnsTrue() {
        // Given
        TextNode textNode = new TextNode("");

        // When
        boolean isEmpty = textNode.isBlank();

        // Then
        assertTrue(isEmpty);
    }

}