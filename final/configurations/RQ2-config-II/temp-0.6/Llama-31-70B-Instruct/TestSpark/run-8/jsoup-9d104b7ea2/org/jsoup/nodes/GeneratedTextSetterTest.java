package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextSetterTest {

    @Test
    public void textSetterTest() {
        TextNode textNode = new TextNode("Hello world!");
        textNode.text("New text");
        assertEquals("New text", textNode.text());
    }

}