package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSplitText_GivenTextNode_WithEmptyValue_ReturnsTextNode {

    @Test
    public void splitText_GivenTextNode_WithEmptyValue_ReturnsTextNode() {
        // Given
        TextNode textNode = new TextNode("");
        int offset = 0;
        Mockito.when(textNode.coreValue()).thenReturn("");

        // When
        TextNode tailNode = textNode.splitText(offset);

        // Then
        assertTrue(tailNode.value().isEmpty());
    }

}