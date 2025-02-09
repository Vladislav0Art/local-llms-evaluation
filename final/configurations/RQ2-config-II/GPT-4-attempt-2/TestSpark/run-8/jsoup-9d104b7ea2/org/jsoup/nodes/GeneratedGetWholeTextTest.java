package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        String text = "Test text";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

}