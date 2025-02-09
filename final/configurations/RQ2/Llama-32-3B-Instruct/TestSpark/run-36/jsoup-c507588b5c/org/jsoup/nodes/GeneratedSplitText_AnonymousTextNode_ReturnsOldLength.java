package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedSplitText_AnonymousTextNode_ReturnsOldLength {

    @Test
    public void splitText_AnonymousTextNode_ReturnsOldLength() {
        TextNode node = new TextNode("");
        assertEquals(0, node.splitText(0));
    }

}