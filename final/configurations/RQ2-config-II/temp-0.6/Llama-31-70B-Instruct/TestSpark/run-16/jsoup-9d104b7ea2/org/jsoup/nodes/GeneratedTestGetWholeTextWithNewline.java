package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetWholeTextWithNewline {

    private TextNode textNode;

    @Test
    public void testGetWholeTextWithNewline() {
        textNode = new TextNode("test\n");
        assertEquals("test\n", textNode.getWholeText());
    }

}