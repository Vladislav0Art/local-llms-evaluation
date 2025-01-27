package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedNodeNameTextTextNode_GivenValidText_ReturnsNodeName {

    @Test
    public void nodeNameTextTextNode_GivenValidText_ReturnsNodeName() {
        // Arrange
        TextNode textNode = new TextNode("test");

        // Act
        String nodeName = textNode.nodeName();

        // Assert
        assertEquals("text", nodeName);
    }

}