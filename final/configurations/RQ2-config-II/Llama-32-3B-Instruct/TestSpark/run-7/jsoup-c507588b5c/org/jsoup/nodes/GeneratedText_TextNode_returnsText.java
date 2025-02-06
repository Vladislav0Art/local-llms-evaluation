package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedText_TextNode_returnsText {

    @Test
    public void text_TextNode_returnsText() {
        // Arrange & Act
        TextNode node = new TextNode("Hello World");
        String result = node.text();

        // Assert
        assertEquals("Hello World", result);
    }

}