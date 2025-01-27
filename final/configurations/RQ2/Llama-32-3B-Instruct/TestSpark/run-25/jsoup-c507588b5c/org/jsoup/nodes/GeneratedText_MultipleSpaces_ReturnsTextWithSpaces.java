package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedText_MultipleSpaces_ReturnsTextWithSpaces {

    @Test
    public void text_MultipleSpaces_ReturnsTextWithSpaces() {
        String text = "   Hello World  ";
        TextNode node = new TextNode(text);
        assertEquals("   Hello World  ", node.text());
    }

}