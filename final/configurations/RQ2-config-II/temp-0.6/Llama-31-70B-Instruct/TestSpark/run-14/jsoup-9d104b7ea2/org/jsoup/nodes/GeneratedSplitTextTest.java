package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("text");
        TextNode splitTextNode = textNode.splitText(2);
        assertEquals("xt", splitTextNode.getWholeText());
    }

}