package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedOuterHtmlTailAppendableDepthDocumentOutputSettingsTextNode_Test {

    @Test
    public void outerHtmlTailAppendableDepthDocumentOutputSettingsTextNode_Test() throws Exception {
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlTail(accum, depth, out);
        assertEquals("", accum.toString());
    }

}