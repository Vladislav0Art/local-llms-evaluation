package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        // Arrange
        TextNode textNode = new TextNode("Some text");

        // Act
        String nodeName = textNode.nodeName();

        // Assert
        assertEquals("#text", nodeName);
    }

}