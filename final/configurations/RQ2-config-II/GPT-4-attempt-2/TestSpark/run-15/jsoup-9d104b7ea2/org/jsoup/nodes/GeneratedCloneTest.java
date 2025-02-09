package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Test");
        TextNode cloneTextNode = node.clone();

        assertNotSame(cloneTextNode, node);
        assertEquals(cloneTextNode.text(), node.text());
    }

}