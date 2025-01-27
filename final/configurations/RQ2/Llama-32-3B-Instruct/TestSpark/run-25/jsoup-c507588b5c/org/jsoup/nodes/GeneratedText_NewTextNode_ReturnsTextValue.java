package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedText_NewTextNode_ReturnsTextValue {

    @Test
    public void text_NewTextNode_ReturnsTextValue() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

}