package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import java.util.List;

public class GeneratedTestOuterHtmlHead {

    private TextNode textNode = new TextNode("Hello World");

    @Test
    public void testOuterHtmlHead() {
        Document document = mock(Document.class);
        Appendable output = mock(Appendable.class);
        when(document.getOutputStream()).thenReturn(output);
        when(textNode.outerHtmlHead(any(Appendable.class), anyInt(), anyDocument.OutputSettings.class)).thenReturn("Hello World");
        textNode.outerHtmlHead(document, 0, null);
        verify(output).append("Hello World");
    }

}