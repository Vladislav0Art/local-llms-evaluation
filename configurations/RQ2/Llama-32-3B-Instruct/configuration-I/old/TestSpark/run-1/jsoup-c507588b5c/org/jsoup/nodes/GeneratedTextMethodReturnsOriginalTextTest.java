package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTextMethodReturnsOriginalTextTest {

    @Test
    public void textMethodReturnsOriginalTextTest() {
        String originalText = "Hello, World!";
        TextNode node = new TextNode(originalText);
        assertEquals(originalText, node.text());
    }

}