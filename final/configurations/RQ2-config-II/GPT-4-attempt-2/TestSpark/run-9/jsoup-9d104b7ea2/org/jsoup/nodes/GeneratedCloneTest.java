package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("test text");
        TextNode clonedNode = node.clone();
        assertNotSame(node, clonedNode);
        assertEquals(node.text(), clonedNode.text());
    }

}