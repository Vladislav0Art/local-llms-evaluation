package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedSplitText_GivenNegativeOffset_ThrowsAssertionError {

    @Test
    public void splitText_GivenNegativeOffset_ThrowsAssertionError() {
        String text = "Hello World";
        int offset = -1;
        TextNode textNode = new TextNode(text);
        assertThrows(IllegalArgumentException.class, () -> textNode.splitText(offset));
    }

}