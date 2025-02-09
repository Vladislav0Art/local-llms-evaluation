package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedTextChangeTest {

    @Test
    public void textChangeTest() {
        TextNode node = new TextNode("textNode");
        node.text("newTextNode");
        assertEquals("newTextNode", node.text());
    }

}