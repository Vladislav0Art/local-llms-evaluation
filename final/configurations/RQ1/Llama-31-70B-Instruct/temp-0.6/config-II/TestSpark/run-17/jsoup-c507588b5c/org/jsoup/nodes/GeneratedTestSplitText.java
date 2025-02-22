package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTestSplitText {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("hello world");
    }

    @Test
    public void testSplitText() {
        TextNode splitTextNode = textNode.splitText(3);
        assertEquals("hel", textNode.getWholeText());
        assertEquals("lo world", splitTextNode.getWholeText());
    }

}