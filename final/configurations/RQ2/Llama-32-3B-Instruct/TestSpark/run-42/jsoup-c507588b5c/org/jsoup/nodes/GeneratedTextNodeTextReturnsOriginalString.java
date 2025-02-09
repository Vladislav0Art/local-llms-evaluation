package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeTextReturnsOriginalString {

    @Test
    public void textNodeTextReturnsOriginalString() {
        String originalText = "Hello World!";
        TextNode textNode = new TextNode(originalText);
        assertEquals(originalText, textNode.text());
    }

}