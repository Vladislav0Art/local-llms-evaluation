package org.jsoup.nodes;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.AfterEach;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    private TextNode currentNode;
    private Document document;

    @Before
    public void setup() {
        document = Mockito.mock(Document.class);
        currentNode = new TextNode("  Hello World");
    }

    @After
    public void tearDown() {
        document = null;
    }

    @Test
    public void testIsBlank_SingleWhitespace() {
        when(currentNode.isBlank()).thenReturn(true);
        assertNotNull(currentNode.text());
        assertFalse(currentNode.text().trim().isEmpty());
    }

    @Test
    public void testIsBlank_NoWhitespace() {
        when(currentNode.isBlank()).thenAnswer(invocation -> false);
        assertNull(currentNode.text());
        assertTrue(currentNode.text().isEmpty());
    }

    @Test
    public void testText_SingleLine() {
        currentNode = new TextNode("Hello World");
        assertNotNull(currentNode.text());
        assertEquals("Hello World", currentNode.text());
    }

    @Test
    public void testText_NoLines() {
        when(currentNode.getWholeText()).thenReturn("");
        assertNull(currentNode.text());
        assertTrue(currentNode.text().isEmpty());
    }

    @Test
    public void testText_EmptyString() {
        when(currentNode.getWholeText()).thenAnswer(invocation -> "");
        assertNull(currentNode.text());
        assertEquals("", currentNode.text());
    }

    @Test
    public void testSplitText_SingleLine() {
        when(currentNode.getWholeText()).thenReturn("Hello World");
        TextNode result = currentNode.splitText(5);
        assertNotNull(result);
        assertEquals("Hello World", result.text());
    }

    @Test
    public void testSplitText_NoLines() {
        when(currentNode.getWholeText()).thenAnswer(invocation -> "");
        assertNull(currentNode.text());
        assertTrue(currentNode.text().isEmpty());
    }

    @Test
    public void testSplitText_EmptyString() {
        when(currentNode.getWholeText()).thenReturn("");
        assertNull(currentNode.text());
        assertEquals("", currentNode.text());
    }

    @Test
    public void testOuterHtmlHead_SplitToNewLine() {
        when(currentNode.outerHtmlHead(Mockito.any(Appendable.class), 0, Mockito.any(Document.OutputSettings.class))).thenReturn("Hello\nWorld");
        TextNode result = currentNode.splitText(5);
        assertNotNull(result);
        assertEquals("Hello\nWorld", result.text());
    }

    @Test
    public void testOuterHtmlTail_SplitToNewLine() {
        when(currentNode.outerHtmlTail(Mockito.any(Appendable.class), 0, Mockito.any(Document.OutputSettings.class))).thenReturn("");
        TextNode result = currentNode.splitText(5);
        assertNotNull(result);
        assertEquals("", result.text());
    }

    @Test
    public void testOuterHtmlHead_NoIndentation() {
        when(currentNode.outerHtmlHead(Mockito.any(Appendable.class), 0, Mockito.any(Document.OutputSettings.class))).thenReturn("Hello World");
        TextNode result = currentNode.splitText(5);
        assertNotNull(result);
        assertEquals("Hello World", result.text());
    }

    @Test
    public void testOuterHtmlTail_NoIndentation() {
        when(currentNode.outerHtmlTail(Mockito.any(Appendable.class), 0, Mockito.any(Document.OutputSettings.class))).thenReturn("");
        TextNode result = currentNode.splitText(5);
        assertNotNull(result);
        assertEquals("", result.text());
    }

    @Test
    public void testFromEncoded() {
        String encodedText = "Hello World";
        when(currentNode.createFromEncoded(encodedText)).thenReturn(new TextNode("Hello World"));
        TextNode text = currentNode.clone();
        assertNotNull(text);
        assertEquals(encodedText, text.text().trim());
    }

}