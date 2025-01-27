package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedTextTextNode_GivenTextSetOnNode_ReturnsText {

    @Test
    public void textTextNode_GivenTextSetOnNode_ReturnsText() {
        // Arrange
        TextNode textNode = new TextNode();
        textNode.text("test");

        // Act
        String text = textNode.text();

        // Assert
        assertEquals("test", text);
    }

}