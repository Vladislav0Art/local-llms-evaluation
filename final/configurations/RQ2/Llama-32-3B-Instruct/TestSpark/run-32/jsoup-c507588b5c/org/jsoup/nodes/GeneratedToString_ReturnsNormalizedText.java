package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedToString_ReturnsNormalizedText {

    @Test
    public void toString_ReturnsNormalizedText() {
        TextNode textNode = new TextNode("Hello\nWorld");
        String text = textNode.toString();
        assertEquals("Hello\nWorld", text);
    }

}