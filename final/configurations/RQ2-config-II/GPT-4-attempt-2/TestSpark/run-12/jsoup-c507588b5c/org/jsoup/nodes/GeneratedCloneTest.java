package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("hello");
        TextNode clonedNode = node.clone();
        assertNotSame(node, clonedNode);
        assertEquals(node.getWholeText(), clonedNode.getWholeText());
    }

}