package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextOffsetAtStartOfText {

    @Test
    public void splitTextOffsetAtStartOfText() {
        TextNode textNode = new TextNode("initial");
        TextNode result = textNode.splitText(0);
        assertNotNull(result);
        assertTrue(result.text().isEmpty());
    }

}