package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;

import static org.junit.Assert.assertEquals;

public class GeneratedTextSetTest {

    @Test
    public void textSetTest() {
        TextNode textNode = new TextNode("My Text");
        textNode.text("New Text");
        assertEquals("New Text", textNode.text());
    }

}