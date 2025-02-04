package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedText_setsCorrectText {

    @Test
    public void text_setsCorrectText() {
        TextNode textNode = new TextNode();
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

}