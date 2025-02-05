package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTextChangeTest {

    @Test
    public void textChangeTest() {
        TextNode textNode = new TextNode("test");
        textNode.text("test2");
        assertEquals("test2", textNode.text());
    }

}