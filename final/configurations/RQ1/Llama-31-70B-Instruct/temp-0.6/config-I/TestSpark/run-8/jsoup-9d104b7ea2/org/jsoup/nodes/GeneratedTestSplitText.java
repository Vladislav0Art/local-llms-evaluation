package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("Test");
        TextNode expected = new TextNode("est");
        assertEquals(expected, textNode.splitText(1));
    }

}