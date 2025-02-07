package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        Element element = new Document().createElement("text", "Hello World");
        TextNode node = Mockito.mock(TextNode.class);
        when(node.outerHtmlTail(Mockito.any(Appendable.class), 1, Mockito.any(Document.OutputSettings.class))).thenReturn(""); // Test that outerHtmlTail() returns the expected value
        assertEquals("", element.outerHtml());
        Mockito.verify(node).outerHtmlTail();
    }

}