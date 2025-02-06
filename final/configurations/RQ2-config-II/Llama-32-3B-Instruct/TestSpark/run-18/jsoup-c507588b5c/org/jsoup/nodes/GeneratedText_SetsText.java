package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedText_SetsText {

    @Test
    public void text_SetsText() {
        TextNode node = new TextNode();
        node.text("test");
        assertEquals("test", node.text());
    }

}