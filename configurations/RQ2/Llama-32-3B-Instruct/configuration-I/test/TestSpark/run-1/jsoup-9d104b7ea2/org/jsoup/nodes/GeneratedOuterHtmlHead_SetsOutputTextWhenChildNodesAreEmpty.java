package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedOuterHtmlHead_SetsOutputTextWhenChildNodesAreEmpty {

    @Test
    public void outerHtmlHead_SetsOutputTextWhenChildNodesAreEmpty() {
        Document document = new Document();
        LeafNode childNode = new LeafNode("child");
        TextNode textNode = new TextNode("");
        textNode.outerHtmlTail(document.output(), 0, document.outputSettings());
        assertEquals("", document.output());
    }

}