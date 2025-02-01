package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextValidOffsetTest {

    @Test
    public void splitTextValidOffsetTest() {
        TextNode textNode = new TextNode("split me");
        TextNode tailNode = textNode.splitText(5);
        assertEquals("split", textNode.text());
        assertEquals(" me", tailNode.text());
    }

}