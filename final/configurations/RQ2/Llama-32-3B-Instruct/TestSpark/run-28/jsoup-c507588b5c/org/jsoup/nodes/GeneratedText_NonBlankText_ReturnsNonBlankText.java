package org.jsoup.nodes;

import org.jsoup.helper.Validate;

import java.io.IOException;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedText_NonBlankText_ReturnsNonBlankText {

    @Test
    public void text_NonBlankText_ReturnsNonBlankText() {
        TextNode textNode = new TextNode("Not default text");
        assertEquals("Not default text", textNode.text());
    }

}