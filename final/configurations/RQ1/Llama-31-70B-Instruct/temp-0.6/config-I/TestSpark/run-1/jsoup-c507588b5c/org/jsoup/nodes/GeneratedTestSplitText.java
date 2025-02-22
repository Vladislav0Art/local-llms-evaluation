package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSplitText {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("This is a text node");
    }

    @Test
    public void testSplitText() {
        TextNode splitTextNode = textNode.splitText(5);
        assertEquals("This ", textNode.getWholeText());
        assertEquals("is a text node", splitTextNode.getWholeText());
    }

}