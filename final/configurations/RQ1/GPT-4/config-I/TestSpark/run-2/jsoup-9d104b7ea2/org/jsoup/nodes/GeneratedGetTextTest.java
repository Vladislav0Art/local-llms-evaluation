package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetTextTest {

    @Test
    public void getTextTest() {
        TextNode textNode = new TextNode(" test text ");
        assertEquals("test text", textNode.text());
    }

}