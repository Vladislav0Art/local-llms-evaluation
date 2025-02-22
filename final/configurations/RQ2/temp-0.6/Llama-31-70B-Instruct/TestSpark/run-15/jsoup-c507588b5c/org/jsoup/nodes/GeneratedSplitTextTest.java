package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Text");
        TextNode newTextNode = textNode.splitText(2);

        assertEquals("Te", textNode.getWholeText());
        assertEquals("xt", newTextNode.getWholeText());
    }

}