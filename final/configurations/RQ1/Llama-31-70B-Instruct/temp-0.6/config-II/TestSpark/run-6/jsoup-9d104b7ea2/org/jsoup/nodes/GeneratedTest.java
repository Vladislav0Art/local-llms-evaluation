package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("text");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        TextNode textNode = new TextNode(" text ");
        assertEquals("text", textNode.text());
    }

    @Test
    public void testText_SetText() {
        TextNode textNode = new TextNode(" text ");
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.getWholeText());
    }

    @Test
    public void testIsBlank_BlankText() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testIsBlank_NonBlankText() {
        TextNode textNode = new TextNode("text");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("text");
        TextNode newTextNode = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("xt", newTextNode.getWholeText());
    }

}