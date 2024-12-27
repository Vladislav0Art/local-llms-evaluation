package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        Document document = Jsoup.parse("<html><body>Hello, <span>World!</span></body></html>");
        LeafNode childNode = new LeafNode("child");
        TextNode textNode = new TextNode("text");

        document.outputSettings().setAppendChildNodesToOutputText(true);
        elementOuterHtmlHead(document, 0, document.outputSettings(), childNode, textNode);

        assertEquals("<html><body>Hello, <span>World!</span></body></html>", document.outerHtml());
    }

}