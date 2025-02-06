package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedText_ReturnsText {

    @Test
    public void text_ReturnsText() {
        TextNode node = new TextNode("test");
        assertEquals("test", node.text());
    }

}