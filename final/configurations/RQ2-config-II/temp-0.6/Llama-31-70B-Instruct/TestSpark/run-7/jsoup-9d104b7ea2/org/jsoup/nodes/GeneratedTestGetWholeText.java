package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        // Arrange
        TextNode textNode = new TextNode("test");

        // Act
        String result = textNode.getWholeText();

        // Assert
        assertEquals("test", result);
    }

}