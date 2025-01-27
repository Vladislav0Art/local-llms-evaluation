package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedSplitTextTextNode_GivenOffset ReturnsCorrectlySplitText {

    @Test
    public void splitTextTextNode_GivenOffset

    ReturnsCorrectlySplitText() {
        // Arrange
        TextNode textNode = new TextNode("test");
        int offset = 3;
        String expectedSplitText = "t";

        // Act
        String splitText = textNode.splitText(offset);

        // Assert
        assertEquals(expectedSplitText, splitText);
    }

}