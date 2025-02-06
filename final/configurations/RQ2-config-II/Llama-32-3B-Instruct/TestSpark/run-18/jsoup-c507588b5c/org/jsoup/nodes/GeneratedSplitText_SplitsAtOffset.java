package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitText_SplitsAtOffset {

    @Test
    public void splitText_SplitsAtOffset() throws IOException {
        String text = "hello world";
        TextNode node = new TextNode(text);
        TextNode left = node.splitText(6);
        assertEquals("helli", left.text());
        assertEquals("world", node.text());
    }

}