package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode textNode = new TextNode("test");
        TextNode cloneNode = (TextNode) textNode.clone();
        assertEquals("test", cloneNode.getWholeText());
    }

}