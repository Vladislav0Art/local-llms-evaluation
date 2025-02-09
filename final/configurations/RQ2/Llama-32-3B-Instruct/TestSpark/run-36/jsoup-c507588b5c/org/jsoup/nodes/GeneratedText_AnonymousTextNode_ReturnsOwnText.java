package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedText_AnonymousTextNode_ReturnsOwnText {

    @Test
    public void text_AnonymousTextNode_ReturnsOwnText() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
    }

}