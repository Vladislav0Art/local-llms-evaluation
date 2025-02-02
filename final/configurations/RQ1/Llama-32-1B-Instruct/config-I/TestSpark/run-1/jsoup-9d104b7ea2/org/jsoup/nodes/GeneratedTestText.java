package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestText {

    @Mock
    private Document.DocumentBuilder documentBuilder;

    public void testCreateFromEncoded() {
        String encodedText = "&lt;Hello&gt;&lt;/Hello&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        when(documentBuilder.build()).thenReturn(textNode);
        verify(out).prettyPrint();
    }

    @Test
    public void testText() {
        TextNode textNode = new TextNode("   \n  Hello World!");
        when(textNode.coreValue()).thenReturn(String.join("\n", new String[]{"Hello", "World"}));

        String result = textNode.getText();
        assertEquals("Hello World!", result);
        verify(out).prettyPrint();
    }

}