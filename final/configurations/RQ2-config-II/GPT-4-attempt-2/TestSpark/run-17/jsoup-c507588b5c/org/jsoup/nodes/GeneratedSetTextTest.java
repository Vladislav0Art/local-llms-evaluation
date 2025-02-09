package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedSetTextTest {

    @Test
    public void setTextTest() {
        TextNode node = new TextNode("test text");
        node.text("new text");
        assertEquals("new text", node.text());
    }

}