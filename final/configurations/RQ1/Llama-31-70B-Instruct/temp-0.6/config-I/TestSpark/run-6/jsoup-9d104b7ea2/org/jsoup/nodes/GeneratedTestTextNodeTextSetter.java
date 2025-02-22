package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTextNodeTextSetter {

    @Test
    public void testTextNodeTextSetter() {
        TextNode textNode = new TextNode("Initial text");
        textNode.text("New text");
        assertEquals("New text", textNode.getWholeText());
        assertEquals("New text", textNode.toString());
    }

}