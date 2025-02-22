package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTextNodeWithInitialText {

    @Test
    public void testTextNodeWithInitialText() {
        TextNode textNode = new TextNode("Sample text");
        assertEquals("Sample text", textNode.getWholeText());
        assertEquals("Sample text", textNode.toString());
    }

}