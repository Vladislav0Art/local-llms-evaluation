package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedOuterHtmlHead_doesNotIncludeBlankTextNodes {

    @Test
    public void outerHtmlHead_doesNotIncludeBlankTextNodes() {
        // [MethodUnderTest][Scenario]Test
        Document document = new Document();
        TextNode textNode = new TextNode("");
        Appendable accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint = true;
        textNode.outerHtmlHead(accum, depth, out);
        assertEquals("", accum.toString());
    }

}