package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Test");
        TextNode copiedNode = node.clone();
        assertNotSame(node, copiedNode);
        assertEquals(node.text(), copiedNode.text());
    }

}