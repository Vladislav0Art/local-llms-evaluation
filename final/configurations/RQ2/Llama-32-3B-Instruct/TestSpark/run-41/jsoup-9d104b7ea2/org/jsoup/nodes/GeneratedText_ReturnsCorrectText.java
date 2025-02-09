package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedText_ReturnsCorrectText {

    @Test
    public void text_ReturnsCorrectText() {
        TextNode node = new TextNode("Hello");
        assertEquals("Hello", node.text());
    }

}