package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitText {

    @Test
    public void splitText() {
        TextNode textNode = new TextNode("Hello world");
        TextNode splitNode = textNode.splitText(5);
        assertEquals("Hello", textNode.text());
        assertEquals(" world", splitNode.text());
    }

}