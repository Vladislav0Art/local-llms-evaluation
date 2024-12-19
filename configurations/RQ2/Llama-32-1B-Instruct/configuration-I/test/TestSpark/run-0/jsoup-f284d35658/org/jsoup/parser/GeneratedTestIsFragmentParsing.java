package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;

public class GeneratedTestIsFragmentParsing {

    public static class ParseSettings {
        String baseUri = "";
    }

    @Test
    public void testIsFragmentParsing() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        String baseUri = "https://example.com";
        String fragmentUri = "fragment-1";
        Document document = (Document) builder.initialiseParse(new Reader(), baseUri).parse().node(fragmentUri);
        assertTrue(document.getBaseURI().equals(baseUri));
    }

}