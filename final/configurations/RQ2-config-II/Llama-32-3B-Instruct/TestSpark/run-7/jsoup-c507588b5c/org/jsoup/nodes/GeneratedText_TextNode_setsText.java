package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedText_TextNode_setsText {

    @Test
    public void text_TextNode_setsText() {
        // Arrange
        TextNode node = new TextNode();
        String text = "New Hello World";

        // Act & Assert
        node.text(text);
        assertEquals(text, node.text());
    }

}