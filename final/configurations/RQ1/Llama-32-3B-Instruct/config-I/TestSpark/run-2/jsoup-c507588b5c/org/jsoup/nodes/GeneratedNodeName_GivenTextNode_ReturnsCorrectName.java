package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

public class GeneratedNodeName_GivenTextNode_ReturnsCorrectName {

    @Test
    public void nodeName_GivenTextNode_ReturnsCorrectName() {
        // Arrange
        TextNode textNode = new TextNode("some text");

        // Act
        String result = textNode.nodeName();

        // Assert
        assertEquals("#text", result);
    }

}