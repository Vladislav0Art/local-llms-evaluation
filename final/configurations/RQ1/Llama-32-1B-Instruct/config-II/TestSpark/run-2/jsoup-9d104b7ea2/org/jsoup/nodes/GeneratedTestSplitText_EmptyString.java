package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSplitText_EmptyString {

    @Test
    public void testSplitText_EmptyString() {
        TextNode node = new TextNode("");
        TextNode result = node.splitText(0);
        assertTrue(result.isBlank());
    }

}