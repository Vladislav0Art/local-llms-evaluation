package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTest {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("Test");
    }

    @Test
    public void testNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        assertEquals("Test", textNode.text());
    }

    @Test
    public void testTextWithNull() {
        textNode.text(null);
        assertEquals("", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        assertEquals("Test", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        assertTrue(!textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode tailNode = textNode.splitText(2);
        assertEquals("Te", textNode.getWholeText());
        assertEquals("st", tailNode.getWholeText());
    }

    @Test
    public void testSplitTextWithInvalidOffset() {
        TextNode tailNode = textNode.splitText(-1);
        assertEquals("Test", textNode.getWholeText());
        assertEquals("Test", tailNode.getWholeText());
    }

    @Test
    public void testSplitTextWithZeroOffset() {
        TextNode tailNode = textNode.splitText(0);
        assertEquals("", textNode.getWholeText());
        assertEquals("Test", tailNode.getWholeText());
    }

}