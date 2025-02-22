package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestText_set {

    @Test
    public void testText_set() {
        TextNode textNode = new TextNode("some text");
        textNode.text("new text");
        String text = textNode.text();
        assertEquals("new text", text);
    }

}