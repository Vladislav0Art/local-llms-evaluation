package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedSetTextTest {

    @Test
    public void setTextTest() {
        TextNode node = new TextNode("old text");
        node.text("new text");
        assertEquals("new text", node.text());
    }

}