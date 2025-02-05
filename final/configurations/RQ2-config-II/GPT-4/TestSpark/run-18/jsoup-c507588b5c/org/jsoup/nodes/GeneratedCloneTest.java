package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("sample text");
        TextNode cloneNode = node.clone();
        assertNotSame(node, cloneNode);
        assertEquals(node.text(), cloneNode.text());
    }

}