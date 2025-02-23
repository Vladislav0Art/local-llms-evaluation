package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void testCreateFromEncoded() {
        TextNode textNode = TextNode.createFromEncoded("&lt;div&gt;");
        assertEquals("&lt;div&gt;", textNode.coreValue());
    }

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("Test");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        TextNode textNode = new TextNode("Test");
        assertEquals("Test", textNode.text());
    }

    @Test
    public void testTextSetText() {
        TextNode textNode = new TextNode("Test");
        textNode.text("Test2");
        assertEquals("Test2", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("Test");
        assertEquals("Test", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("Test");
        TextNode textNode2 = textNode.splitText(1);
        assertEquals("T", textNode.coreValue());
        assertEquals("est", textNode2.coreValue());
    }

}