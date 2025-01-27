package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHead_HtmlWithOffset_ReturnsAccumulatedString {

    @Test
    public void outerHtmlHead_HtmlWithOffset_ReturnsAccumulatedString() throws IOException {
        StringBuilder accum = new StringBuilder();
        TextNode node = new TextNode("<p>Hello</p>");
        Document.OutputSettings out = new Document.OutputSettings(0, 0);
        node.outerHtmlHead(accum, 1, out);
        assertEquals("<p><span style=\"display:none\">Hello</span>", accum.toString());
    }

}