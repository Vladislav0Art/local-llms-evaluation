package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest nodeName {

    @Test
    public void test

    nodeName() {
        // Arrange
        String text = "Hello World";

        // Act
        TextNode textNode = new TextNode(text);
        String nodeName = textNode.getNodeName();

        // Assert
        assertEquals("text", nodeName);
    }

}