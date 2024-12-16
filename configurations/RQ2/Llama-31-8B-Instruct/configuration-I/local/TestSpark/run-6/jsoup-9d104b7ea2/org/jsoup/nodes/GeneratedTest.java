package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

    @Test
    public void text_SetTextTest() {
        TextNode textNode = new TextNode("test");
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void isBlankTest_EmptyText() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlankTest_WhitespaceText() {
        TextNode textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlankTest_NotBlankText() {
        TextNode textNode = new TextNode("test");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest_OffsetAtEnd() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.splitText(textNode.text().length());
        assertEquals("", textNode.text());
        assertEquals("test", result.text());
    }

    @Test
    public void splitTextTest_OffsetBeforeEnd() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.splitText(2);
        assertEquals("te", textNode.text());
        assertEquals("st", result.text());
    }

}