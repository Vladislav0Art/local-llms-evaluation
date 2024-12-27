package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        Document document = Jsoup.parse("<html><body>Hello, World!</body></html>");
        LeafNode childNode = new LeafNode("child");
        TextNode textNode = new TextNode("");

        document.outputSettings().setAppendChildNodesToOutputText(false);
        elementOuterHtmlTail(document, 0, document.outputSettings(), childNode, textNode);

        assertEquals("<html><body>Hello, World!</body></html>", document.outerHtml());
    }

}