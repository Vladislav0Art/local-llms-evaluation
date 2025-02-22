package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.nodes.TextNode;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("Text");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        String text = "Text";
        TextNode textNode = new TextNode(text);
        textNode.text(text);
        assertEquals(text, textNode.text());
    }

    @Test
    public void testGetWholeText() {
        String text = "Text";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        String text = "Text";
        TextNode textNode = new TextNode(text);
        TextNode newNode = textNode.splitText(2);
        assertEquals("Te", textNode.getWholeText());
        assertEquals("xt", newNode.getWholeText());
    }

    @Test
    public void testOuterHtmlHead() {
        String text = "Text";
        TextNode textNode = new TextNode(text);
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        Mockito.when(out.prettyPrint()).thenReturn(true);
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals("Text", accum.toString());
    }

}