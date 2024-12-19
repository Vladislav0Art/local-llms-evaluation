package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedCloneMethodReturnsNewTextNodeWithOriginalContentTest {

    @Test
    public void cloneMethodReturnsNewTextNodeWithOriginalContentTest() {
        String originalText = "Hello, World!";
        TextNode node = new TextNode(originalText);
        TextNode clonedNode = node.clone();
        assertEquals(originalText, clonedNode.text());
    }

}