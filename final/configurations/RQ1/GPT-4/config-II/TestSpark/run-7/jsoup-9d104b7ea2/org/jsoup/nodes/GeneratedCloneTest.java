package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Test");
        TextNode cloneNode = node.clone();
        assertNotNull(cloneNode);
        assertEquals(node.getWholeText(), cloneNode.getWholeText());
    }

}