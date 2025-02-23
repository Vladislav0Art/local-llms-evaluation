package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedSplitTextTest {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("test text");
    }

    @Test
    public void splitTextTest() {
        TextNode splitNode = textNode.splitText(4);
        assertEquals("test", textNode.coreValue());
        assertEquals(" text", splitNode.coreValue());
    }

}