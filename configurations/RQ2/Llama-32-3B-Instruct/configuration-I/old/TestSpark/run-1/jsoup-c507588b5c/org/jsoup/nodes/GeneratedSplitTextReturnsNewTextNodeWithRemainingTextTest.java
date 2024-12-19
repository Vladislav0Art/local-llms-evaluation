package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedSplitTextReturnsNewTextNodeWithRemainingTextTest {

    @Test
    public void splitTextReturnsNewTextNodeWithRemainingTextTest() {
        String originalText = "Hello, World!";
        int offset = 7;
        TextNode node = new TextNode(originalText);
        TextNode newTreeNode = node.splitText(offset);
        assertEquals("World!", newTreeNode.text());
        assertEquals(originalText.substring(0, offset), node.text());
    }

}