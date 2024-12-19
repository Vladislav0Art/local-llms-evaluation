package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.jsoup.parser.HtmlTreeBuilder;
import org.mockito.Mockito;

public class GeneratedTestInitialiseParse {

    private Document defaultSettings() {
        return Jsoup.parse("<html><body></body></html>");
    }

    @Test
    public void testInitialiseParse() {
        String input = "<html><body>Hello World!</body></html>";
        String baseUri = "https://example.com";
        Parser parser = new Parser();
        builder.initialiseParse(input, baseUri, parser);
        assertEquals(parser, defaultUri());
    }

}