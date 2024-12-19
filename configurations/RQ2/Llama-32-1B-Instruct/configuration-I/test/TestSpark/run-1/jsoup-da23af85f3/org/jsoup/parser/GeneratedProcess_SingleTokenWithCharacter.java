package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

public class GeneratedProcess_SingleTokenWithCharacter {

    @Test
    public void process_SingleTokenWithCharacter() {
        Node node = new TaggedNode("<p>This is a paragraph</p>");
        String baseUri = "https://example.com/baseuri";
        HtmlTreeBuilderState state = builder.newInstance().process(node, null, baseUri, new Parser());
        assertEquals("HTML", state.tagName());
    }

}