package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextChangeTest {

    @Test
    public void textChangeTest() {
        TextNode node = new TextNode("Test text");
        node.text("Changed text");

        assertEquals("Changed text", node.text());
    }

}