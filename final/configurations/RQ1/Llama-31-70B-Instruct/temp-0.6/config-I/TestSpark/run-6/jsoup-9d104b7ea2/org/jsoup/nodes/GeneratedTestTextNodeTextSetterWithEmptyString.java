package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTextNodeTextSetterWithEmptyString {

    @Test
    public void testTextNodeTextSetterWithEmptyString() {
        TextNode textNode = new TextNode("Initial text");
        textNode.text("");
        assertEquals("", textNode.getWholeText());
        assertEquals("", textNode.toString());
    }

}