package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedToString_AnonymousTextNode_ReturnsTagName {

    @Test
    public void toString_AnonymousTextNode_ReturnsTagName() {
        TextNode node = new TextNode("");
        assertEquals("text", node.toString());
    }

}