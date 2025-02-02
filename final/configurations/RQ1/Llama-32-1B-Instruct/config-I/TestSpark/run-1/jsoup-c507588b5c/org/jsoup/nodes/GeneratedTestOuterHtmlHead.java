package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.mockito.Mockito.*;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        Document doc = mock(Document.class);
        when(doc.getOutputSettings()).thenReturn(new Document.OutputSettings(true));
        outerHtmlTail(appendable:mock(Element.class), depth:1, outputSettings:doc.outputSettings());
        verify(appendable).removeChildren();
    }

}