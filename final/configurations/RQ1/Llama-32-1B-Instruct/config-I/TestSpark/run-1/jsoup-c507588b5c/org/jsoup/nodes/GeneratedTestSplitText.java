package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.mockito.Mockito.*;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        Document doc = mock(Document.class);
        when(nodeGetWholeText()).thenReturn("Hello World");
        TextNode splitNode = nodeSplitText(0, doc);
        assertEquals("Hello World", splitNode.text());
        verify(nodeGetWholeText()).thenReturn("Hello World");
        outerHtmlHead(appendable:mock(Element.class), depth:1, outputSettings:doc.outputSettings());
        verify(appendable).addChildren();
    }

}