package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedCloneNodeTest {

    @Test
    public void cloneNodeTest() {
        TextNode node = new TextNode("Some text");
        TextNode cloneNode = node.clone();
        assertNotEquals(node, cloneNode);
        assertEquals(node.getWholeText(), cloneNode.getWholeText());
    }

}