package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedText_BlankText_ReturnsBlankString {

    @Test
    public void text_BlankText_ReturnsBlankString() {
        String blankText = "   ";
        TextNode textNode = new TextNode(blankText);
        assertEquals(blankText, textNode.text());
    }

}