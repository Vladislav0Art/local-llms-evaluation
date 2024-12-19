package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetStack {

    public static class ParseSettings {
        String baseUri = "";
    }

    @Test
    public void testGetStack() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = (Document) builder.parse();
        assertEquals("", ((HtmlTreeBuilder) document).getStack());
    }

}