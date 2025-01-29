package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTestText {

    @Test
    public void testText() {
        String text = "Hello, World!";
        Element element = Mockito.mock(Element.class);
        TextNode node = new TextNode(text);
        Mockito.when(element.getText()).thenReturn(text);
        assertEquals(text, node.text(text));
    }

}