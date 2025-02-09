package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedText_ReturnsBlankStringWhenEmpty {

    @Test
    public void text_ReturnsBlankStringWhenEmpty() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
    }

}