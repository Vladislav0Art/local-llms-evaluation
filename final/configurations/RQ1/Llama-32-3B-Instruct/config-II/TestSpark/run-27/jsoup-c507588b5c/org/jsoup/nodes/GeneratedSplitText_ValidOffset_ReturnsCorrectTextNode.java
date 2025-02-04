package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitText_ValidOffset_ReturnsCorrectTextNode {

    @Test
    public void splitText_ValidOffset_ReturnsCorrectTextNode() throws IOException {
        String encodedText = "&lt;Test&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        TextNode result = textNode.splitText(3);
        assertEquals("World", result.text());
    }

}