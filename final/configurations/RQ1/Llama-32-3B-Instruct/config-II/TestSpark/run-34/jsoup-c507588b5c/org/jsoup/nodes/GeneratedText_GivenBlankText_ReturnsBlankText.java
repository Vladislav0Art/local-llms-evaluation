package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedText_GivenBlankText_ReturnsBlankText {

    @Test
    public void text_GivenBlankText_ReturnsBlankText() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertEquals("", textNode.text());
    }

}