package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

public class GeneratedParseFragment_Simple {

    @Test
    public void parseFragment_Simple() {
        String inputFragment = "<p>This is a paragraph</p>";
        Element element = HtmlTreeBuilder.parseFragment(inputFragment, null, "https://example.com/baseuri", new Parser());
        assertNotNull(element);
    }

}