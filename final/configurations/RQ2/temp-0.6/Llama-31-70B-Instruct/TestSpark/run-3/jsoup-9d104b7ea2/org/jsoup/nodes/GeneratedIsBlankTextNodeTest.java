package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedIsBlankTextNodeTest {

    @Test
    public void isBlankTextNodeTest() {
        TextNode textNode = new TextNode("text");
        assertFalse(textNode.isBlank());
    }

}