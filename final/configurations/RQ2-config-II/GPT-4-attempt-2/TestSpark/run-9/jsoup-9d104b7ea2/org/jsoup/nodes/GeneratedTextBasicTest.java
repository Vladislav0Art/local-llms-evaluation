package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTextBasicTest {

    @Test
    public void textBasicTest() {
        TextNode node = new TextNode("test text");
        assertEquals("test text", node.text());
    }

}