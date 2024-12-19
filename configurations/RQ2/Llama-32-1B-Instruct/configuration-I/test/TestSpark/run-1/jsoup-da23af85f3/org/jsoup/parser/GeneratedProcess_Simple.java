package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

public class GeneratedProcess_Simple {

    @Test
    public void process_Simple() {
        Node node = new TaggedNode("p");
        String baseUri = "https://example.com/baseuri";
        HtmlTreeBuilderState state = builder.newInstance().process(node, null, baseUri, new Parser());
        assertEquals("HTML", state.tagName());
    }

}