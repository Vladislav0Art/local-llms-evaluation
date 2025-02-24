package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("text");
        TextNode splitText = textNode.splitText(2);
        assertEquals("te", textNode.text());
        assertEquals("xt", splitText.text());
    }

}