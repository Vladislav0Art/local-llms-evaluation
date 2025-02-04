package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedClone_GivenTextNode_ReturnsNewTextNode {

    @Test
    public void clone_GivenTextNode_ReturnsNewTextNode() {
        // Given
        TextNode originalTextNode = new TextNode("Hello World");

        // When
        TextNode clonedTextNode = originalTextNode.clone();

        // Then
        assertNotNull(clonedTextNode);
        assertEquals(originalTextNode.value(), clonedTextNode.value());
    }

}