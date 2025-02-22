package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTextNodeTextSetterWithNull {

    @Test
    public void testTextNodeTextSetterWithNull() {
        TextNode textNode = new TextNode("Initial text");
        textNode.text(null);
        assertNull(textNode.getWholeText());
        assertEquals("", textNode.toString());
    }

}