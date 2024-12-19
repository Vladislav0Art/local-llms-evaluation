package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedOuterHtmlHead_containsProperIndentation {

    @Test
    public void outerHtmlHead_containsProperIndentation() {
        // [MethodUnderTest][Scenario]Test
        Document document = new Document();
        TextNode textNode = new TextNode("");
        textNode.parentNode.addChildren(0, textNode);
        Appendable accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint = true;
        textNode.outerHtmlHead(accum, depth, out);
        assertTrue(accum.toString().contains("\t"));
    }

}