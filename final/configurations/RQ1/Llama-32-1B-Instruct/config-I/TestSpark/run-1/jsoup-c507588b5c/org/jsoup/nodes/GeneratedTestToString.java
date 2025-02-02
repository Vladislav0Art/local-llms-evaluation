package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.mockito.Mockito.*;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        Document doc = mock(Document.class);
        when(doc.getOutputSettings()).thenReturn(new Document.OutputSettings(true));
        String expected = "<p>Hello</p>";
        outerHtmlHead(appendable:mock(Element.class), depth:1, outputSettings:doc.outputSettings());
        verify(appendable).addChildren();
        assertEquals(expected, nodeToString(doc));
    }

}