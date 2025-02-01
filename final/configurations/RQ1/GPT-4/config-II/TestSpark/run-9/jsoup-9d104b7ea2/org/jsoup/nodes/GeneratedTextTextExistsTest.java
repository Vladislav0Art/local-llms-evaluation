package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextTextExistsTest {

    @Test
    public void textTextExistsTest() {
        TextNode textNode = new TextNode("Hello");

        assertEquals("Hello", textNode.text());
    }

}