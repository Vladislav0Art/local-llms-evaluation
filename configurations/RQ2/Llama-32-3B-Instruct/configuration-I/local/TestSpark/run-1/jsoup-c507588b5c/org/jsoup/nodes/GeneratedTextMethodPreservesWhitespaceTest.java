package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTextMethodPreservesWhitespaceTest {

    @Test
    public void textMethodPreservesWhitespaceTest() {
        String originalText = "Hello,\nWorld!";
        TextNode node = new TextNode(originalText);
        assertEquals("Hello,\nWorld!", node.text());
    }

}