package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("test");
        TextNode splitText = textNode.splitText(1);
        assertEquals("t", textNode.coreValue());
        assertEquals("est", splitText.coreValue());
    }

}