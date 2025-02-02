package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

public class GeneratedCreateTextNode_GivenValidText_ReturnsTextNode {

    @Test
    public void createTextNode_GivenValidText_ReturnsTextNode() {
        // Arrange
        String text = "Hello World";

        // Act
        TextNode actual = new TextNode(text);

        // Assert
        assertEquals(text, actual.value);
    }

}