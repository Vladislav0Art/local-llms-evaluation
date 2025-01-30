package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Hello");
        TextNode clonedNode = node.clone();
        assertNotNull(clonedNode);
        assertNotSame(node, clonedNode);
        assertEquals(node.text(), clonedNode.text());
    }

}