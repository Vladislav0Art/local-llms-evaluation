package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

public class GeneratedCreateFromEncoded_ReturnsCorrectTextNode {

    @Test
    public void createFromEncoded_ReturnsCorrectTextNode() {
        // Arrange
        String encodedText = "&lt;Hello World&gt;";
        TextNode expectedTextNode = new TextNode("Hello World");

        // Act
        TextNode actual = TextNode.createFromEncoded(encodedText);

        // Assert
        assertEquals(expectedTextNode, actual);
    }

}