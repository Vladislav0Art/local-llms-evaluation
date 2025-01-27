package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.mockito.Mockito;

public class GeneratedNewNodeTextSingleCharacter {

    @Test
    public void newNodeTextSingleCharacter() {
        // Arrange
        String text = "a";
        TextNode node = new TextNode(text);

        // Act & Assert
        assertEquals("a", node.text());
        assertFalse(node.isBlank());
    }

}