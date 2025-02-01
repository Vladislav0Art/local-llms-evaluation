package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello");
        TextNode tailNode = textNode.splitText(3);

        assertEquals("Hel", textNode.text());
        assertEquals("lo", tailNode.text());
    }

}