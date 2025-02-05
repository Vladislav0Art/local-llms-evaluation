package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Test Text Node");
        TextNode clonedNode = textNode.clone();
        assertEquals(textNode.text(), clonedNode.text());
        assertNotSame(textNode, clonedNode);
    }

}