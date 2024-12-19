package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetBaseUri {

    public static class ParseSettings {
        String baseUri = "";
    }

    @Test
    public void testGetBaseUri() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        String baseUri = "https://example.com";
        Document document = (Document) builder.parse();
        assertEquals(baseUri, document.getBaseURI());
    }

}