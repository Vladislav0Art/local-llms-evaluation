package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import java.util.List;

public class GeneratedTestOuterHtmlTail {

    private TextNode textNode = new TextNode("Hello World");

    @Test
    public void testOuterHtmlTail() {
        Document document = mock(Document.class);
        Appendable output = mock(Appendable.class);
        when(document.getOutputStream()).thenReturn(output);
        when(textNode.outerHtmlTail(any(Appendable.class), anyInt(), anyDocument.OutputSettings.class)).thenReturn("Hello World");
        textNode.outerHtmlTail(document, 0, null);
        verify(output).append("Hello World");
    }

}