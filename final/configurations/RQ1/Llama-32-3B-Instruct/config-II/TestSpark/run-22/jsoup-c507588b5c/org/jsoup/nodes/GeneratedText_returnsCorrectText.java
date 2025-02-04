package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedText_returnsCorrectText {

    @Test
    public void text_returnsCorrectText() {
        TextNode textNode = new TextNode("Hello, World!");
        assertEquals("Hello, World!", textNode.text());
    }

}