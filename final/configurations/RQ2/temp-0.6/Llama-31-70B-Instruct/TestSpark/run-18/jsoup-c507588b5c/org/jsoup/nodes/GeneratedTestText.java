package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestText {

    @Test
    public void testText() {
        TextNode textNode = new TextNode("hello world");
        String text = textNode.text();
        assertEquals("hello world", text);
    }

}