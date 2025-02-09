package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedIsBlank_NonBlankTextNode_ReturnsFalse {

    @Test
    public void isBlank_NonBlankTextNode_ReturnsFalse() {
        TextNode textNode = new TextNode("Hello");
        assertFalse(textNode.isBlank());
    }

}