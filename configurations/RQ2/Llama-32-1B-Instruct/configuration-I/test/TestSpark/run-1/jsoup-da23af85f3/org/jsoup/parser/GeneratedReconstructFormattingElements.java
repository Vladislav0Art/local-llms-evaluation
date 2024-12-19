package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

public class GeneratedReconstructFormattingElements {

    @Test
    public void reconstructFormattingElements() {
        Node node = new TaggedNode("<p>This is a paragraph</p>");
        String baseUri = "https://example.com/baseuri";
        builder.newInstance().process(node, null, baseUri, new Parser()).reconstructFormattingElements();
        assertEquals("HTML", node.tagName());
    }

}