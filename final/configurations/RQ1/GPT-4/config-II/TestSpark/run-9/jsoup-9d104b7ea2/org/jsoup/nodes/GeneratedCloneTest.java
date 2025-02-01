package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Hello");
        TextNode clonedTextNode = textNode.clone();

        assertNotSame(textNode, clonedTextNode);
        assertEquals(textNode.text(), clonedTextNode.text());
    }

}