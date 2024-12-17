package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        String text = "div";
        TextNode node = new TextNode(text);
        assertEquals("div", node.nodeName());
    }

}