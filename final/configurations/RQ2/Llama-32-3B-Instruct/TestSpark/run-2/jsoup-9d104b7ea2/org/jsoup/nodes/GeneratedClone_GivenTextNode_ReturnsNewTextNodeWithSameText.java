package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedClone_GivenTextNode_ReturnsNewTextNodeWithSameText {

    @Test
    public void clone_GivenTextNode_ReturnsNewTextNodeWithSameText() {
        TextNode originalTextNode = new TextNode("Hello, World!");
        TextNode clonedTextNode = originalTextNode.clone();
        assertEquals(originalTextNode, clonedTextNode);
    }

}