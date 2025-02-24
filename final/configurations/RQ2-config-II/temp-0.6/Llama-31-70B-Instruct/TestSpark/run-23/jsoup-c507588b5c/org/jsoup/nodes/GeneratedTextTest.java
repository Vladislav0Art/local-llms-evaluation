package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;

import static org.junit.Assert.assertEquals;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("My Text");
        assertEquals("My Text", textNode.text());
    }

}