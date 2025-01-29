package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestLastCharIsWhitespace {

    @Test
    public void testLastCharIsWhitespace() {
        Document document = new Document();
        Element element = document.createElement("text");

        TextNode textNode = new TextNode(document, element);

        Mockito.when(TextNode.lastCharIsWhitespace(Mockito.any(StringBuilder.class))).thenReturn(true);
        assertEquals(true, textNode.lastCharIsWhitespace(new StringBuilder(element.getText())));
    }

}