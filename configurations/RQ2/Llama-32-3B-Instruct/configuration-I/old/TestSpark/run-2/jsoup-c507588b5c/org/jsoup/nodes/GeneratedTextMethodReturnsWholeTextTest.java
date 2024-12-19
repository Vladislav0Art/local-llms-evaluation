package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextMethodReturnsWholeTextTest {

    @Test
    public void textMethodReturnsWholeTextTest() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.text());
    }

}