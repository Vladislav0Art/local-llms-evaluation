package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextChainTest {

    @Test
    public void textChainTest() {
        TextNode textNode = new TextNode("Hello");
        textNode.text("World");
        assertEquals("World", textNode.text());
    }

}