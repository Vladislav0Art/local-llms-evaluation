package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedSplitTextTest {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("Test");
    }

    @After
    public void tearDown() {
        textNode = null;
    }

    @Test
    public void splitTextTest() {
        TextNode textNode2 = textNode.splitText(1);
        assertEquals("T", textNode.getWholeText());
        assertEquals("est", textNode2.getWholeText());
    }

}