package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.mockito.Mockito.*;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        Document doc = mock(Document.class);
        when(doc.getOutputSettings()).thenReturn(new Document.OutputSettings(true));
        outerHtmlHead(appendable:mock(Element.class), depth:1, outputSettings:doc.outputSettings());
        verify(appendable).removeChildren();
    }

}