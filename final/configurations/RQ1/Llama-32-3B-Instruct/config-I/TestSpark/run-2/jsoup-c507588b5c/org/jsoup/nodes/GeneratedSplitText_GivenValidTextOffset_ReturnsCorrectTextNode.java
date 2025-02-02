package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

public class GeneratedSplitText_GivenValidTextOffset_ReturnsCorrectTextNode {

    @Test
    public void splitText_GivenValidTextOffset_ReturnsCorrectTextNode() throws IOException {
        // Arrange
        String originalText = "Hello World";
        int offset = 5;
        TextNode textNode = new TextNode(originalText);

        // Act
        TextNode actual = textNode.splitText(offset);

        // Assert
        assertEquals(4, actual.value.length());
    }

}