package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedCreateTextNode_textIsNotBlank returnsNotBlank {

    @Test
    public void createTextNode_textIsNotBlank

    returnsNotBlank() {
        TextNode textNode = new TextNode("not blank");
        assertFalse(textNode.isBlank());
    }

}