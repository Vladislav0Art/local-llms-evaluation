package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTextNodeWithEmptyText {

    @Test
    public void testTextNodeWithEmptyText() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.getWholeText());
        assertEquals("", textNode.toString());
    }

}