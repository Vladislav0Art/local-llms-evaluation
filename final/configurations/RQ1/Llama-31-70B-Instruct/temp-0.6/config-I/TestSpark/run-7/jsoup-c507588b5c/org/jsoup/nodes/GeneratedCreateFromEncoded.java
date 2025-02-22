package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncoded {

    @Test
    public void createFromEncoded() {
        String encodedText = "&amp;lt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        String expectedText = "&lt;";
        assertEquals(expectedText, textNode.text());
    }

}