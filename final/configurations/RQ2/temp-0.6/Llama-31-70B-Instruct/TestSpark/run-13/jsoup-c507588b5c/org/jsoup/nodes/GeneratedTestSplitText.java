package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSplitText {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("text");
    }

    @Test
    public void testSplitText() {
        TextNode tailNode = textNode.splitText(2);
        assertEquals("xt", tailNode.getWholeText());
        assertEquals("te", textNode.getWholeText());
    }

}