package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedIsBlankWithNullTest {

    @Test
    public void isBlankWithNullTest() {
        TextNode textNode = new TextNode(null);
        assertTrue(textNode.isBlank());
    }

}