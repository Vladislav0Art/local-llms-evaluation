package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

public class GeneratedSplitText_GivenInvalidOffset_ReturnsException {

    @Test
    public void splitText_GivenInvalidOffset_ReturnsException() {
        // Arrange
        String originalText = "Hello World";
        int offset = -1;
        TextNode textNode = new TextNode(originalText);

        // Act and Assert
        assertThrows(IndexOutOfBoundsException.class, () -> textNode.splitText(offset));
    }

}