package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        Element element = new Document().createElement("text", "Hello World");
        TextNode node = Mockito.mock(TextNode.class);
        when(node.outerHtmlHead(Mockito.any(Appendable.class), 1, Mockito.any(Document.OutputSettings.class))).thenReturn(""); // Test that outerHtmlHead() returns the expected value
        assertEquals("", element.outerHtml());
        Mockito.verify(node).outerHtmlHead();
    }

}