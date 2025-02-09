package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextChangeTest {

    @Test
    public void textChangeTest() {
        TextNode textNode = new TextNode("Test");
        textNode.text("NewTest");
        assertEquals("NewTest", textNode.text());
    }

}