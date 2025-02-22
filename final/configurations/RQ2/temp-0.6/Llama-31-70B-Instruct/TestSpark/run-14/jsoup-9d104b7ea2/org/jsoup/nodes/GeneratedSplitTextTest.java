package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("abcdef");
        TextNode splitNode = textNode.splitText(3);
        assertEquals(textNode.text(), "abc");
        assertEquals(splitNode.text(), "def");
    }

}