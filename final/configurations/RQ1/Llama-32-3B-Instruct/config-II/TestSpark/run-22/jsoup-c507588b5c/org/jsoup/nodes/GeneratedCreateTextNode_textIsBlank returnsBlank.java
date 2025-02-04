package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedCreateTextNode_textIsBlank returnsBlank {

    @Test
    public void createTextNode_textIsBlank

    returnsBlank() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}