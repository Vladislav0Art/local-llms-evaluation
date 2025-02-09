package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode node = new TextNode("test text");
        assertEquals("test text", node.text());
    }

}