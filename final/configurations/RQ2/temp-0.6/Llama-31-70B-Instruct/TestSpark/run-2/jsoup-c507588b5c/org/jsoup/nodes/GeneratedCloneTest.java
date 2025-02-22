package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("test");
        TextNode cloneNode = (TextNode) textNode.clone();
        assertEquals("test", cloneNode.getWholeText());
    }

}