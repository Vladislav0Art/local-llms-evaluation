package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.mockito.Mockito.*;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        Document doc = mock(Document.class);
        outerHtmlHead(appendable:mock(Element.class), depth:1, outputSettings:doc.outputSettings());
        verify(appendable).addChildren();
        assertTrue(nodeIsBlank(doc));
    }

}