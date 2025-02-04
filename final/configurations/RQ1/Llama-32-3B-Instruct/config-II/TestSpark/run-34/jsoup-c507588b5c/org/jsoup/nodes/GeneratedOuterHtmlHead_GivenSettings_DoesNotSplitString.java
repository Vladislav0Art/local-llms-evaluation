package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedOuterHtmlHead_GivenSettings_DoesNotSplitString {

    @Test
    public void outerHtmlHead_GivenSettings_DoesNotSplitString() throws IOException {
        Document.OutputSettings out = new Document.OutputSettings();
        Appendable accum = new StringBuilder();
        int depth = 0;
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlHead(accum, depth, out);
        assertEquals("Hello World", accum.toString());
    }

}