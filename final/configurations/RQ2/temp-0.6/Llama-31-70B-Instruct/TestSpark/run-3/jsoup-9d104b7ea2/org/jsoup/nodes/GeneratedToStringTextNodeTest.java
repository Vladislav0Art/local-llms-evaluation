package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedToStringTextNodeTest {

    @Test
    public void toStringTextNodeTest() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.toString());
    }

}