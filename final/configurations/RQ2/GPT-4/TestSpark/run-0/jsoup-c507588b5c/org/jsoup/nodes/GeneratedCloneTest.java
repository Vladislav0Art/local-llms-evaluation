package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("test");
        TextNode clonedNode = node.clone();
        assertNotSame(node, clonedNode);
        assertEquals(node.text(), clonedNode.text());
    }

}