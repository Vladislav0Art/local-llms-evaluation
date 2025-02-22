package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestSplitTextWithZeroOffset {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("Test");
    }

    @Test
    public void testSplitTextWithZeroOffset() {
        TextNode tailNode = textNode.splitText(0);
        assertEquals("", textNode.getWholeText());
        assertEquals("Test", tailNode.getWholeText());
    }

}