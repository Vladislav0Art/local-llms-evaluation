package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        String text = "Test text";
        TextNode textNode = new TextNode(text);
        assertEquals("#text", textNode.nodeName());
    }

}