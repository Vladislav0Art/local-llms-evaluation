package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedSplitText_SplitsTextNodeAtOffset_ReturnsNewTextNode {

    @Test
    public void splitText_SplitsTextNodeAtOffset_ReturnsNewTextNode() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        TextNode newTextNode = textNode.splitText(6);
        assertEquals("World", newTextNode.text());
        assertTrue(textNode.isBlank());
    }

}