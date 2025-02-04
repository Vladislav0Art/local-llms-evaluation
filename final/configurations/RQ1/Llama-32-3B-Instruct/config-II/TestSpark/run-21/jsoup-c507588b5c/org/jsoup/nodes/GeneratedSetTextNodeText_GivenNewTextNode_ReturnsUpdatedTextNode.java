package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSetTextNodeText_GivenNewTextNode_ReturnsUpdatedTextNode {

    @Test
    public void setTextNodeText_GivenNewTextNode_ReturnsUpdatedTextNode() {
        // Given
        TextNode textNode = new TextNode("");
        String newText = "Hello World";
        Mockito.when(textNode.coreValue()).thenReturn("");

        // When
        textNode.text(newText);

        // Then
        assertEquals("Hello World", textNode.value());
    }

}