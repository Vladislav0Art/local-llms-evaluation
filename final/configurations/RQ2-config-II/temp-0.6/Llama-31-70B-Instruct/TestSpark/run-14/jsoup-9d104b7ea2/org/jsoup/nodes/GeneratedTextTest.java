package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.text());
    }

}