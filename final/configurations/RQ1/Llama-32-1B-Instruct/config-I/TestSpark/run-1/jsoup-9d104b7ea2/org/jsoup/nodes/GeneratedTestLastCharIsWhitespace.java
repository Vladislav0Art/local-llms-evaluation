package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestLastCharIsWhitespace {

    @Mock
    private Document.DocumentBuilder documentBuilder;

    public void testCreateFromEncoded() {
        String encodedText = "&lt;Hello&gt;&lt;/Hello&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        when(documentBuilder.build()).thenReturn(textNode);
        verify(out).prettyPrint();
    }

    @Test
    public void testLastCharIsWhitespace() {
        TextNode textNode = new TextNode("   \n  Hello World!");
        when(lastCharIsWhitespace("   \n  Hello World!")).thenReturn("World!");

        String result = textNode.lastCharIsWhitespace(textNode.text());
        assertEquals(true, result);
        verify(parent, times(1)).toString();
    }

}