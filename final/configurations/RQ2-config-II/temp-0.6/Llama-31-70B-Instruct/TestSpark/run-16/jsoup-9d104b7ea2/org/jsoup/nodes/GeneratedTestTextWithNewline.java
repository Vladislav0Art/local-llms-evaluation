package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTextWithNewline {

    private TextNode textNode;

    @Test
    public void testTextWithNewline() {
        textNode = new TextNode("test\n");
        assertEquals("test", textNode.text());
    }

}