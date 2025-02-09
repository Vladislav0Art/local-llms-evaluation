package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedIsBlank_AnonymousTextNode_ReturnsTrue {

    @Test
    public void isBlank_AnonymousTextNode_ReturnsTrue() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}