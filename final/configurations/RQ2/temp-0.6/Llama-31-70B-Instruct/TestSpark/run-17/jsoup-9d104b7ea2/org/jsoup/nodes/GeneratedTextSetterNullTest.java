package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTextSetterNullTest {

    @Test
    public void textSetterNullTest() {
        TextNode textNode = new TextNode("test text");
        assertEquals("test text", textNode.text());
        textNode.text(null);
        assertEquals("", textNode.text());
    }

}