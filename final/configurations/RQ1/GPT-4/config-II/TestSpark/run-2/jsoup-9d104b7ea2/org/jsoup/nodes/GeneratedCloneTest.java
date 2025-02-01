package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Hello World");
        TextNode clonedNode = textNode.clone();
        assertEquals(textNode.getWholeText(), clonedNode.getWholeText());
        assertNotSame(textNode, clonedNode);
    }

}