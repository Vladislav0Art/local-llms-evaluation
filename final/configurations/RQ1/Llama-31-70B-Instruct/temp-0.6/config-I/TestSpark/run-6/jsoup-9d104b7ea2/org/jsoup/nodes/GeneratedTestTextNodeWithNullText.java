package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTextNodeWithNullText {

    @Test
    public void testTextNodeWithNullText() {
        TextNode textNode = new TextNode(null);
        assertNull(textNode.getWholeText());
        assertEquals("", textNode.toString());
    }

}