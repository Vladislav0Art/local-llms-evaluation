package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTail_HtmlWithoutOffset_ReturnsAccumulatedString {

    @Test
    public void outerHtmlTail_HtmlWithoutOffset_ReturnsAccumulatedString() {
        StringBuilder accum = new StringBuilder();
        TextNode node = new TextNode("<p>Hello</p>");
        Document.OutputSettings out = new Document.OutputSettings(0, 0);
        node.outerHtmlTail(accum, 1, out);
        assertEquals("<p>Hello</p>", accum.toString());
    }

}