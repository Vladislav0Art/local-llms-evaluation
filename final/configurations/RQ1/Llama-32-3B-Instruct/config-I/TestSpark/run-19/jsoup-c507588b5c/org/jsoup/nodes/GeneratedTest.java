package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedTest {

    public static String text_ReturnsTextNodeWithUpdatedText(String text) throws IOException {
        TextNode textNode = new TextNode(text);
        return textNode.text("New Text");
    }

    @Test
    public void newTextNode_GivenText_ReturnsTextNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
    }

    @Test
    public void nodeName_ReturnsCorrectString() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void text_ReturnsText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

    @Test
    public void getWholeText_ReturnsEntireText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

    @Test
    public void isBlank_ReturnsTrueWhenTextIsEmptyOrWhitespaceOnly() {
        TextNode textNode1 = new TextNode("   ");
        assertTrue(textNode1.isBlank());

        TextNode textNode2 = new TextNode("");
        assertTrue(textNode2.isBlank());
    }

    @Test
    public void splitText_SplitsTextNodeAtCorrectOffset() throws IOException {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        int offset = 6;
        TextNode tailNode = textNode.splitText(offset);
        assertEquals("World", tailNode.text());
    }

    @Test
    public void splitText_ThrowsExceptionWhenOffsetIsNegative() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertThrows(IllegalArgumentException.class, () -> textNode.splitText(-1));
    }

    @Test
    public void outerHtmlHead_AppendsToOutputString() throws IOException {
        Appendable output = Mockito.mock(Appendable.class);
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlHead(output, 0, null);
        assertEquals("<p>Hello World</p>", output.toString());
    }

    @Test
    public void outerHtmlTail_DoesNotAppendToOutputString() {
        Appendable output = Mockito.mock(Appendable.class);
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlTail(output, 0, null);
        assertEquals("", output.toString());
    }

    @Test
    public void testNewTextNode_GivenText_ReturnsTextNode() {
        String text = "Hello World";
        String result = newTextNode(text);
        assertNotNull(result);
    }

}