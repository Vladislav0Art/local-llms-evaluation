package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedGetWholeText_TextNode_returnsText {

    @Test
    public void getWholeText_TextNode_returnsText() {
        // Arrange & Act
        TextNode node = new TextNode("Hello\nWorld");
        String result = node.getWholeText();

        // Assert
        assertEquals("Hello\nWorld", result);
    }

}