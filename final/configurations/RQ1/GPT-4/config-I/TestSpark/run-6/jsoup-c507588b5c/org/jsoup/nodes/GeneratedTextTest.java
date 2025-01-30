package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode node = new TextNode("   Some text    ");
        assertEquals("Some text", node.text());
    }

}