package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedTestOuterHtmlHead {

    public static void main(String[] args) {
        new TextNodeTest().run();
    }

    @Test
    public void testOuterHtmlHead() {
        Document document = new Document();
        Element element = document.createElement("text");

        TextNode textNode = new TextNode(document, element);

        Mockito.when(element.outerHtmlHead(Mockito.any(Appendable.class), Mockito.anyInt(Mockito.any < Document.OutputSettings.class))).thenReturn(null);
        assertEquals("", textNode.outerHtmlHead((Appendable) null, 0));
    }

}