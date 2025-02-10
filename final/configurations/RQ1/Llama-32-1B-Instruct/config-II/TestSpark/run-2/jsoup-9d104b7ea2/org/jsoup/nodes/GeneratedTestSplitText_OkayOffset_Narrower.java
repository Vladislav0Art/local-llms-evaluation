package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSplitText_OkayOffset_Narrower {

    @Test
    public void testSplitText_OkayOffset_Narrower() {
        TextNode node = new TextNode("Hello, World!");
        TextNode result = node.splitText(5);
        assertTrue(result.isBlank());
    }

}