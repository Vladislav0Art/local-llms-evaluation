package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedOuterHtmlTail_AppendsChildNodesToOutputText {

    @Test
    public void outerHtmlTail_AppendsChildNodesToOutputText() {
        Document document = new Document();
        LeafNode childNode = new LeafNode("child");
        TextNode textNode = new TextNode("text");
        textNode.outerHtmlHead(document.output(), 0, document.outputSettings());
        assertEquals("", textNode.getWholeText());
    }

}