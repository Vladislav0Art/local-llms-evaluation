package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("text");
        TextNode cloneNode = textNode.clone();
        assertNotSame(textNode, cloneNode);
        assertEquals(textNode.text(), cloneNode.text());
    }

}