package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedSplitText_GivenOffset_SplitsTextNodeCorrectly {

    @Test
    public void splitText_GivenOffset_SplitsTextNodeCorrectly() throws IOException {
        String text = "Hello World";
        int offset = 7;
        TextNode textNode = new TextNode(text);
        TextNode tailNode = textNode.splitText(offset);
        assertEquals("Hello", tailNode.text());
        assertNotNull(tailNode.parentNode());
    }

}