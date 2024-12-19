package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.jsoup.parser.HtmlTreeBuilder;
import org.mockito.Mockito;

public class GeneratedTest_process {

    private Document defaultSettings() {
        return Jsoup.parse("<html><body></body></html>");
    }

    @Test
    public void test_process() {
        String input = "<html><body>Hello World!</body></html>";
        String baseUri = "https://example.com";
        Element token = new Element("a");
        builder.process(token, input);
        assertEquals(true, token.hasAttr("href"));
    }

}