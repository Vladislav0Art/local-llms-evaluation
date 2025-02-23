package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestText {

    private TextNode textNode;

    @Test
    public void testText() {
        textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

}