package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.jsoup.parser.HtmlTreeBuilder;
import org.mockito.Mockito;

public class GeneratedTest_process_with_token {

    private Document defaultSettings() {
        return Jsoup.parse("<html><body></body></html>");
    }

    @Test
    public void test_process_with_token() {
        Document doc = builder.process(input, null);
        assertEquals(doc.body().selectFirst("p"), doc.selectFirst("p"));
    }

}