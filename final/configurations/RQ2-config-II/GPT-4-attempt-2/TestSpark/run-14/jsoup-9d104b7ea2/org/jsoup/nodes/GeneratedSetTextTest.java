package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetTextTest {

    @Test
    public void setTextTest() {
        TextNode textNode = new TextNode("Test text");
        textNode.text("Another test text");
        assertEquals("Another test text", textNode.text());
    }

}