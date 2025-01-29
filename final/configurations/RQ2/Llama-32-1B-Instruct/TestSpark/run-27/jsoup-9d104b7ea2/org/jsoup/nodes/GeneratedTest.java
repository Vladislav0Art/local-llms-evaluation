package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;

public class GeneratedTest {

    @Mock
    private Appendable appendable;

    @InjectMocks
    private TextNode textNode;

    @Test
    public void testToString() {
        String expected = "Hello World!";
        when(appendable.toString()).thenReturn(expected);
        assertEquals(expected, textNode.toString());
    }

    @Test
    public void testGetWholeText() {
        String expected = "Hello World! This is a sample text.";
        Document document = new Document();
        document.appendChild(new TextNode("Hello World!"));
        document.appendChild(new TextNode("This is a sample text."));
        when(getWholeText()).thenReturn(expected);
        assertEquals(expected, textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        String expected = true;
        Document document = new Document();
        document.appendChild(new TextNode(""));
        when(isBlank()).thenReturn(expected);
        assertEquals(expected, textNode.isBlank());
    }

    @Test
    public void testSplitTextOffset0() {
        String expected = "Hello World!";
        TextNode text = new TextNode("Hello World!");
        when(splitText(0)).thenReturn(text);
        assertEquals(text, textNode.splitText(0));
    }

    @Test
    public void testSplitTextOffset1() {
        String expected = "This is a sample text.";
        TextNode text = new TextNode("This is a sample text.");
        when(splitText(1)).thenReturn(text);
        assertEquals(text, textNode.splitText(1));
    }

    @Test
    public void testIsBlankAtOffset0() {
        String expected = true;
        Document document = new Document();
        when(isBlank()).thenReturn(expected);
        assertEquals(expected, textNode.isBlankAtOffset(0));
    }

    @Test
    public void testIsBlankAtOffset1() {
        String expected = false;
        Document document = new Document();
        when(isBlank()).thenReturn(expected);
        assertEquals(expected, textNode.isBlankAtOffset(1));
    }

}