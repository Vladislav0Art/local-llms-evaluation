package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGivenNonBlankTextNodeWhenGetWholeText returnsCorrectText {

    @Test
    public void givenNonBlankTextNodeWhenGetWholeText

    returnsCorrectText() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

}