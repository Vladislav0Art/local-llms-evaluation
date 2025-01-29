package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        String text = "Hello, World!";
        Document document = Mockito.mock(Document.class);
        Element element = Mockito.mock(Element.class);
        TextNode node = new TextNode(text);
        Mockito.when(element.getText()).thenReturn(text);
        Mockito.when(document.body()).thenReturn(document);
        Mockito.when(document.body().append(element)).thenReturn(element);
        assertEquals(3, node.splitText(0).getWholeText().length());
    }

}