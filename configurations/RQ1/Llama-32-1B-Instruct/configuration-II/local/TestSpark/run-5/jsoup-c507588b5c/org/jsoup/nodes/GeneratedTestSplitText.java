package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        String text = "Hello World";
        TextNode result = TextNode.splitText(6);
        assertEquals("World", result.text());
        assertTrue(!result.text().isEmpty());
    }

}