package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedText_SplitTextNode text {

    @Test
    public void text_SplitTextNode

    text() {
        TextNode textNode = new TextNode("Hello\nWorld");
        String text = ((TextNode) textNode.splitText(0).splitText(textNode.getText().length())).getText();
        assertEquals("Hello\nWorld", text);
    }

}