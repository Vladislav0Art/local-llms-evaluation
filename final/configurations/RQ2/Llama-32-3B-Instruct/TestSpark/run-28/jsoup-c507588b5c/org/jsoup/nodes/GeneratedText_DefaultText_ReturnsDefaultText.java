package org.jsoup.nodes;

import org.jsoup.helper.Validate;

import java.io.IOException;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedText_DefaultText_ReturnsDefaultText {

    @Test
    public void text_DefaultText_ReturnsDefaultText() {
        TextNode textNode = new TextNode("Default text");
        assertEquals("Default text", textNode.text());
    }

}