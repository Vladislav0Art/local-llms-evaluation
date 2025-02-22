package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeSplitTextTest {

    @Test
    public void textNodeSplitTextTest() {
        TextNode textNode = new TextNode("test");
        TextNode splitNode = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("st", splitNode.getWholeText());
    }

}