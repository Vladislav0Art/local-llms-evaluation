package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode tn = new TextNode("sample text");
        TextNode clonedNode = tn.clone();
        assertNotSame(tn, clonedNode);
        assertEquals(tn.getWholeText(), clonedNode.getWholeText());
    }

}