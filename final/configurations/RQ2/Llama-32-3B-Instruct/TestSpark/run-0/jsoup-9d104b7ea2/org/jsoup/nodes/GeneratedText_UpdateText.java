package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedText_UpdateText {

    @Test
    public void text_UpdateText() {
        TextNode node = new TextNode("Hello World");
        String newText = "New Text";
        node.text(newText);
        assertEquals(newText, node.text());
    }

}