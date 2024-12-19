package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedText_GivenBlankText_ReturnsBlankString {

    @Test
    public void text_GivenBlankText_ReturnsBlankString() {
        String rawText = "";
        TextNode textNode = new TextNode(rawText);
        assertEquals("", textNode.text());
    }

}