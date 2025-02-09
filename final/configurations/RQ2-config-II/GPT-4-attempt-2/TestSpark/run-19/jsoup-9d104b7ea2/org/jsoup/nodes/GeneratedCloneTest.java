package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("toClone");
        TextNode cloneNode = node.clone();
        assertNotSame(node, cloneNode);
        assertEquals(node.getWholeText(), cloneNode.getWholeText());
    }

}