package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        String text = "Test text";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

}