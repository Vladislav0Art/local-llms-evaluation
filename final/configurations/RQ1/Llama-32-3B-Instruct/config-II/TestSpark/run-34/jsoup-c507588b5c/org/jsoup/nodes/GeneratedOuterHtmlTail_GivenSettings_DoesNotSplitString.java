package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedOuterHtmlTail_GivenSettings_DoesNotSplitString {

    @Test
    public void outerHtmlTail_GivenSettings_DoesNotSplitString() throws IOException {
        Document.OutputSettings out = new Document.OutputSettings();
        Appendable accum = new StringBuilder();
        int depth = 0;
        TextNode textNode = new TextNode("");
        textNode.outerHtmlTail(accum, depth, out);
        assertEquals("", accum.toString());
    }

}