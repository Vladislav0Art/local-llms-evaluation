package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextOffsetInTheMiddleOfText {

    @Test
    public void splitTextOffsetInTheMiddleOfText() {
        TextNode textNode = new TextNode("initial");
        String text = "initial";
        int offset = 6;
        TextNode result = textNode.splitText(offset);
        assertNotNull(result);
        assertEquals(text.substring(0, offset), result.text());
    }

}