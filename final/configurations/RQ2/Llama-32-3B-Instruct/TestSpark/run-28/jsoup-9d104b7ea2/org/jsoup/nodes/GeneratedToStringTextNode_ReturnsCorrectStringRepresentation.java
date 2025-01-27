package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedToStringTextNode_ReturnsCorrectStringRepresentation {

    @Test
    public void toStringTextNode_ReturnsCorrectStringRepresentation() {
        // Arrange
        TextNode textNode = new TextNode("test");

        // Act
        String toString = textNode.toString();

        // Assert
        assertEquals("<text>test</text>", toString);
    }

}