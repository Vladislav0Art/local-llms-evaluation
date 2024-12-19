package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.jsoup.parser.HtmlTreeBuilder;
import org.mockito.Mockito;

public class GeneratedTest_framesetOk {

    private Document defaultSettings() {
        return Jsoup.parse("<html><body></body></html>");
    }

    @Test
    public void test_framesetOk() {
        boolean ok = true;
        Element element = new Element("div");
        builder.framesetOk(element, ok);
        assertTrue(element.hasAttr("data-framesetok"));
    }

}