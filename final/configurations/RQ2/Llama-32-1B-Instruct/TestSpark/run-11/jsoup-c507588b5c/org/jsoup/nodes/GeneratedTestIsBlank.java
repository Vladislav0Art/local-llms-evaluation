package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        Document document = new Document();
        Element element = document.createElement("text");
        element.setText("test");

        TextNode textNode = new TextNode(document, element);
        assertTrue(textNode.isBlank());

        textNode = new TextNode(document, element);
        assertFalse(textNode.isBlank());
    }

}