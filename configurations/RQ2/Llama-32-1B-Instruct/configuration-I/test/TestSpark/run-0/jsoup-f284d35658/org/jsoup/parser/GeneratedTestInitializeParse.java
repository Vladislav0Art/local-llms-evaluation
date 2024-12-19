package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;

public class GeneratedTestInitializeParse {

    public static class ParseSettings {
        String baseUri = "";
    }

    @Test
    public void testInitializeParse() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        String baseUri = "https://example.com";
        Parser parser = new Parser();
        builder.initialiseParse(parser, baseUri);
        Document document = builder.parse();
        assertEquals(baseUri, document.getBaseURI());
    }

}