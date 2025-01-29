package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedTestOuterHtmlTail {

    public static void main(String[] args) {
        new TextNodeTest().run();
    }

    @Test
    public void testOuterHtmlTail() {
        Document document = new Document();
        Element element = document.createElement("text");

        TextNode textNode = new TextNode(document, element);

        Mockito.when(element.outerHtmlTail(Mockito.any(Appendable.class), Mockito.anyInt(Mockito.any < Document.OutputSettings.class))).thenReturn(null);
        assertEquals("", textNode.outerHtmlTail((Appendable) null, 0));
    }

}