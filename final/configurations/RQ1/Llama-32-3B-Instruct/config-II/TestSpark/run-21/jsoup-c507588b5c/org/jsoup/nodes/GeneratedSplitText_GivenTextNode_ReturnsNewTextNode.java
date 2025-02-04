package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSplitText_GivenTextNode_ReturnsNewTextNode {

    @Test
    public void splitText_GivenTextNode_ReturnsNewTextNode() {
        // Given
        TextNode textNode = new TextNode("Hello World");
        int offset = 6;
        Mockito.when(textNode.coreValue()).thenReturn("Hello World");

        // When
        TextNode tailNode = textNode.splitText(offset);

        // Then
        assertEquals(10, tailNode.value().length());
    }

}