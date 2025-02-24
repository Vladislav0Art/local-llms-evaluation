package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void TextNodeConstructorTest() {
        TextNode textNode = new TextNode("text");
        assertNotNull(textNode);
    }

    @Test
    public void TextNodeNodeNameTest() {
        TextNode textNode = new TextNode("text");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void TextNodeTextTest() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.text());
    }

    @Test
    public void TextNodeTextSetterTest() {
        TextNode textNode = new TextNode("text");
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

    @Test
    public void TextNodeGetWholeTextTest() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.getWholeText());
    }

    @Test
    public void TextNodeIsBlankTest() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void TextNodeSplitTextTest() {
        TextNode textNode = new TextNode("text");
        TextNode splitText = textNode.splitText(2);
        assertEquals("xt", splitText.text());
    }

}