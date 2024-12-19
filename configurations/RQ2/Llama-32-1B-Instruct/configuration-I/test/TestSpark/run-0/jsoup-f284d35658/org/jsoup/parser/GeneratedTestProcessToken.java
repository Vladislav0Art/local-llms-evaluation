package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;

public class GeneratedTestProcessToken {

    public static class ParseSettings {
        String baseUri = "";
    }

    @Test
    public void testProcessToken() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        String token = "html";
        Document document = (Document) builder.parse().node(token);
        assertTrue(builder.process(new Token(token)));
        assertFalse(builder.process(new Token("other")));
    }

}