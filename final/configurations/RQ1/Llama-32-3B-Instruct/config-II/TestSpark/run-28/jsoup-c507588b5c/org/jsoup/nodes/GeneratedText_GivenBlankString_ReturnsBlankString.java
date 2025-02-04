package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedText_GivenBlankString_ReturnsBlankString {

    @Test
    public void text_GivenBlankString_ReturnsBlankString() {
        String blankText = "";
        TextNode textNode = new TextNode(blankText);
        assertEquals("", textNode.text());
    }

}