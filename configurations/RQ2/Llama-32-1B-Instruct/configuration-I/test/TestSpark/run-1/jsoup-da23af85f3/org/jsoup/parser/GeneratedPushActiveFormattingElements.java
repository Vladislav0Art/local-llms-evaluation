package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

public class GeneratedPushActiveFormattingElements {

    @Test
    public void pushActiveFormattingElements() {
        Node node = new TaggedNode("<p>This is a paragraph</p>");
        String baseUri = "https://example.com/baseuri";
        HtmlTreeBuilderState state = builder.newInstance().process(node, null, baseUri, new Parser()).pushActiveFormattingElements();
        assertEquals("HTML", state.tagName());
    }

}