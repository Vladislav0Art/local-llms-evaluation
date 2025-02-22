package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("test");
    }

    @Test
    public void testNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        assertEquals("test", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode splitTextNode = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("st", splitTextNode.getWholeText());
    }

    @Test
    public void testSplitTextWithNegativeOffset() {
        textNode.splitText(-1);
    }

    @Test
    public void testSplitTextWithOffsetGreaterThanLength() {
        textNode.splitText(5);
    }

}