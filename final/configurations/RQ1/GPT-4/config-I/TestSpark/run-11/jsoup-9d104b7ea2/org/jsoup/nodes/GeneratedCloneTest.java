package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        TextNode cloneNode = node.clone();
        assertNotSame(node, cloneNode);
        assertEquals(node.getWholeText(), cloneNode.getWholeText());
    }

}