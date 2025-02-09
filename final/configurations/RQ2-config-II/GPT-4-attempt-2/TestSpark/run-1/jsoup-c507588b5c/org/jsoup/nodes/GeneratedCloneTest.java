package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("clone text");
        TextNode cloneTextNode = textNode.clone();
        assertFalse(textNode == cloneTextNode);
        assertEquals(textNode.text(), cloneTextNode.text());
    }

}