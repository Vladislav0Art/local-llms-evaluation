package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestSplitTextBlankOffset {

    @Test
    public void testSplitTextBlankOffset() {
        String text = "   Hello ";
        TextNode result = TextNode.splitText(-1);
        assertEquals("Hello ", result.text());
        assertTrue(result.text().isEmpty());
    }

}