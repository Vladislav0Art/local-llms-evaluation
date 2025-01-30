package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextGetSetTest {

    @Test
    public void textGetSetTest() {
        TextNode node = new TextNode("   sample   ");
        assertEquals("sample", node.text());
        node.text("updated text");
        assertEquals("updated text", node.text());
    }

}