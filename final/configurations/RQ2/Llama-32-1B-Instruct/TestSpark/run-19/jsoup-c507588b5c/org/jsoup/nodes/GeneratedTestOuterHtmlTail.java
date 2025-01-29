package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        String text = "Hello, World!";
        Document document = Mockito.mock(Document.class);
        Element element = Mockito.mock(Element.class);
        TextNode node = new TextNode(text);
        Mockito.when(element.getOuterHtml()).thenReturn("Hello, World!");
        assertEquals("Hello, World!", node.outerHtmlTail(document, 0, null));
    }

}