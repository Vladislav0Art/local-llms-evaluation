package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTextSetterTest {

    @Test
    public void textSetterTest() {
        TextNode textNode = new TextNode("test text");
        assertEquals("test text", textNode.text());
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

}