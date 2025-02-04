package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedToString_GivenTextNode_ReturnsOuterHtml {

    @Test
    public void toString_GivenTextNode_ReturnsOuterHtml() {
        // Given
        TextNode textNode = new TextNode("Hello World");

        // When
        String outerHtml = textNode.toString();

        // Then
        assertTrue(outerHtml.contains("<span>Hello World</span>"));
    }

}