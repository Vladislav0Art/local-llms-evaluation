package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedClone_ClonedTextNode_ReturnsNewText {

    @Test
    public void clone_ClonedTextNode_ReturnsNewText() {
        TextNode node = new TextNode("Hello World");
        TextNode clone = node.clone();
        assertNotSame(node, clone);
        assertTrue(clone.text().equals(node.text()));
    }

}