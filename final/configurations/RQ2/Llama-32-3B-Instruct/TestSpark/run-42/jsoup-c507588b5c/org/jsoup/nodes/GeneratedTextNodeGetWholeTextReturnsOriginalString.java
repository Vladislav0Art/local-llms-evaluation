package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeGetWholeTextReturnsOriginalString {

    @Test
    public void textNodeGetWholeTextReturnsOriginalString() {
        String originalText = "Hello World!";
        TextNode textNode = new TextNode(originalText);
        assertEquals(originalText, textNode.getWholeText());
    }

}