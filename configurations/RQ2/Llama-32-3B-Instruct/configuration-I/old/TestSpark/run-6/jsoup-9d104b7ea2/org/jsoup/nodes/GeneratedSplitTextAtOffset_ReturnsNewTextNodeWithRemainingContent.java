package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitTextAtOffset_ReturnsNewTextNodeWithRemainingContent {

    @Test
    public void splitTextAtOffset_ReturnsNewTextNodeWithRemainingContent() throws IOException {
        String text = "Hello World!";
        int offset = 6;
        TextNode textNode = new TextNode(text);
        TextNode newTextNode = textNode.splitText(offset);
        assertEquals("World!", newTextNode.text());
    }

}