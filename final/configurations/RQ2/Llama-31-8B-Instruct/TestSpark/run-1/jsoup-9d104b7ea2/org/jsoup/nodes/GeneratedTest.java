package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void nodeName_ReturnsTextNode() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void text_ReturnsTextNodeText() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.text());
    }

    @Test
    public void text_SetTextNodeText() {
        TextNode textNode = new TextNode("");
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

    @Test
    public void getWholeText_ReturnsTextNodeText() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.getWholeText());
    }

    @Test
    public void isBlank_ReturnsFalse() {
        TextNode textNode = new TextNode("text");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void isBlank_ReturnsTrue() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitText_ReturnsTextNode() {
        TextNode textNode = new TextNode("text");
        TextNode result = textNode.splitText(0);
        assertEquals("text", result.text());
    }

    @Test
    public void splitText_SplitsTextNode() {
        TextNode textNode = new TextNode("text");
        TextNode result = textNode.splitText(1);
        assertEquals("", result.text());
        assertEquals("t", textNode.text());
    }

}