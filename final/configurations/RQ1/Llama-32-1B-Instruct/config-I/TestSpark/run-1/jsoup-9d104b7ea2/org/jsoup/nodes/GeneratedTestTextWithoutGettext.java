package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestTextWithoutGettext {

    @Mock
    private Document.DocumentBuilder documentBuilder;

    public void testCreateFromEncoded() {
        String encodedText = "&lt;Hello&gt;&lt;/Hello&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        when(documentBuilder.build()).thenReturn(textNode);
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