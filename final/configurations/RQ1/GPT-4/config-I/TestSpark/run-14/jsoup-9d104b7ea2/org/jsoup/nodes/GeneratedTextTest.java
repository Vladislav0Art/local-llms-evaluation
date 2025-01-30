package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode node = new TextNode(" Test ");
        assertEquals("Test", node.text());
        node.text("New Text");
        assertEquals("New Text", node.text());
    }

}