package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;

import static org.junit.Assert.assertEquals;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("My Text");
        TextNode newNode = textNode.splitText(2);
        assertEquals("My", textNode.text());
        assertEquals(" Text", newNode.text());
    }

}