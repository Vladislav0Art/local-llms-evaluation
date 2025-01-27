package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedOuterHtmlHeadAppendableDepthDocumentOutputSettingsTextNode_Test {

    @Test
    public void outerHtmlHeadAppendableDepthDocumentOutputSettingsTextNode_Test() throws Exception {
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlHead(accum, depth, out);
        assertEquals("<text>Hello World</text>", accum.toString());
    }

}