package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestNormaliseWhitespace {

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

}