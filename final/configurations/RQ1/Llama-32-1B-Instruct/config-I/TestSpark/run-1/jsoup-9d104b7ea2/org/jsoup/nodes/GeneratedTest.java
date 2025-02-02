package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTest {

    @Mock
    private Document.DocumentBuilder documentBuilder;

    public void testCreateFromEncoded() {
        String encodedText = "&lt;Hello&gt;&lt;/Hello&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        when(documentBuilder.build()).thenReturn(textNode);
        verify(out).prettyPrint();
    }

    @Test
    public void testNormaliseWhitespace() {
        TextNode textNode = new TextNode("   \n  Hello World!");
        when(normaliseWhitespace("   \n  Hello World!")).thenReturn("Hello World!");

        String result = textNode.normaliseWhitespace(textNode.text());
        assertEquals("Hello World!", result);
        verify(parent, times(1)).toString();
    }

    @Test
    public void testStripLeadingWhitespace() {
        TextNode textNode = new TextNode("   \n  Hello World!");
        when(stripLeadingWhitespace("   \n  Hello World!")).thenReturn("Hello World!");

        String result = textNode.stripLeadingWhitespace(textNode.text());
        assertEquals("Hello World!", result);
        verify(parent, times(1)).toString();
    }

    @Test
    public void testLastCharIsWhitespace() {
        TextNode textNode = new TextNode("   \n  Hello World!");
        when(lastCharIsWhitespace("   \n  Hello World!")).thenReturn("World!");

        String result = textNode.lastCharIsWhitespace(textNode.text());
        assertEquals(true, result);
        verify(parent, times(1)).toString();
    }

    @Test
    public void testText() {
        TextNode textNode = new TextNode("   \n  Hello World!");
        when(textNode.coreValue()).thenReturn(String.join("\n", new String[]{"Hello", "World"}));

        String result = textNode.getText();
        assertEquals("Hello World!", result);
        verify(out).prettyPrint();
    }

    @Test
    public void testTextWithoutBuilder() {
        TextNode textNode = new TextNode("   \n  Hello World!");
        when(textNode.text()).thenReturn("Hello World!");

        String result = textNode.getText();
        assertEquals("Hello World!", result);
        verify(out).prettyPrint();
    }

    @Test
    public void testTextWithoutGettext() {
        TextNode textNode = new TextNode("   \n  Hello World!");
        when(textNode.getText()).thenReturn("");

        String result = textNode.getText();
        assertEquals("", result);
        verify(parent, times(1)).toString();
    }

}