package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.nodes.TextNode;

public class GeneratedTest {

    private TextNode textNode;
    private static final String VALID_TEXT = "This is a valid text";
    private static final String INVALID_TEXT = "This is an invalid text";

    @Before
    public void setUp() {
        textNode = new TextNode(VALID_TEXT);
    }

    @Test
    public void testTextNodeConstructor() {
        TextNode textNode = new TextNode(VALID_TEXT);
        assertEquals(VALID_TEXT, textNode.text());
    }

    @Test
    public void testNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        textNode.text(INVALID_TEXT);
        assertEquals(INVALID_TEXT, textNode.text());
    }

    @Test
    public void testGetWholeText() {
        assertEquals(VALID_TEXT, textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        assertFalse(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode(VALID_TEXT);
        TextNode splitTextNode = textNode.splitText(2);
        assertEquals("This", textNode.text());
        assertEquals("is a valid text", splitTextNode.text());
    }

}