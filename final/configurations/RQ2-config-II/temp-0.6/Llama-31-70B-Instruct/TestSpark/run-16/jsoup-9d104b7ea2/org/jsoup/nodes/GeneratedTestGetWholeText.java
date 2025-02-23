package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetWholeText {

    private TextNode textNode;

    @Test
    public void testGetWholeText() {
        textNode = new TextNode("test");
        assertEquals("test", textNode.getWholeText());
    }

}