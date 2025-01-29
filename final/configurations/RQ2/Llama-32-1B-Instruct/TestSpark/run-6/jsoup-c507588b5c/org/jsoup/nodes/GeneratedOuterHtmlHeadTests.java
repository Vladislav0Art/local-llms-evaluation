package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTests {

    @Test
    public void outerHtmlHeadTests() {
        Document document = new Document();
        Appendable accum = document.createOuterHtmlAccumulator();
        StringBuilder builder = new StringBuilder();
        TextNode textNode = new TextNode("Hello");
        int depth = 0;
        textNode.outerHtmlHead(accum, depth, null);
        assertEquals("<p>Hello</p>", accum.toString());
    }

}