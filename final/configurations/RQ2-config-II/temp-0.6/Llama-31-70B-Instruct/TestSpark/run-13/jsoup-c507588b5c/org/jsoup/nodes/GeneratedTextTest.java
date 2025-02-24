package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
        textNode.text("Hello world!");
        assertEquals("Hello world!", textNode.text());
    }

}