package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTextNodeInitializeTest {

    @Test
    public void textNodeInitializeTest() {
        String testText = "example text";
        TextNode textNode = new TextNode(testText);
        assertNotNull(textNode);
        assertEquals(testText, textNode.text());
    }

}