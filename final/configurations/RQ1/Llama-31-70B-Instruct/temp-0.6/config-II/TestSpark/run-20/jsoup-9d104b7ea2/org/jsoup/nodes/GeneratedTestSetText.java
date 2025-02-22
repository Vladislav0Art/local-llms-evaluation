package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetText {

    @Test
    public void testSetText() {
        TextNode node = new TextNode("text");
        node.text("new text");
        assertEquals("new text", node.getWholeText());
    }

}