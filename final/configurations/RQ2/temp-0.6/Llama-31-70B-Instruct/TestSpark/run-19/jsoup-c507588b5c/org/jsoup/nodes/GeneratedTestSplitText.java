package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTestSplitText {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("Some text");
    }

    @Test
    public void testSplitText() {
        TextNode newTextNode = textNode.splitText(2);
        assertEquals("Some", textNode.text());
        assertEquals(" text", newTextNode.text());
    }

}