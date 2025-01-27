package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedGetWholeTextTextNode_GivenValidText_ReturnsWholeText {

    @Test
    public void getWholeTextTextNode_GivenValidText_ReturnsWholeText() {
        // Arrange
        TextNode textNode = new TextNode("test");

        // Act
        String wholeText = textNode.getWholeText();

        // Assert
        assertEquals("test", wholeText);
    }

}