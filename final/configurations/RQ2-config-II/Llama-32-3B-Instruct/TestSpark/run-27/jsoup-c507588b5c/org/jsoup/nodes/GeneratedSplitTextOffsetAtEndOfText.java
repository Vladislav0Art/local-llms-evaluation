package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextOffsetAtEndOfText {

    @Test
    public void splitTextOffsetAtEndOfText() {
        TextNode textNode = new TextNode("initial");
        String text = "initial";
        int offset = text.length();
        TextNode result = textNode.splitText(offset);
        assertNotNull(result);
        assertTrue(result.text().isEmpty());
    }

}