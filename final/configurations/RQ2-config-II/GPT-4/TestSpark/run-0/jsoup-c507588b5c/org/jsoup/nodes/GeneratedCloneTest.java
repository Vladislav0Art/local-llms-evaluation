package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Sample Text");
        TextNode cloneTextNode = textNode.clone();
        assertEquals("Sample Text", cloneTextNode.text());
        assertNotSame(textNode, cloneTextNode);
    }

}