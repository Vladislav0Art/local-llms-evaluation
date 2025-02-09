package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedGetWholeText_AnonymousTextNode_ReturnsOwnText {

    @Test
    public void getWholeText_AnonymousTextNode_ReturnsOwnText() {
        TextNode node = new TextNode("");
        assertEquals("", node.getWholeText());
    }

}