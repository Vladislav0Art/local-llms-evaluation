package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Text");
        textNode.text("New Text");
        assertEquals("New Text", textNode.text());
    }

}