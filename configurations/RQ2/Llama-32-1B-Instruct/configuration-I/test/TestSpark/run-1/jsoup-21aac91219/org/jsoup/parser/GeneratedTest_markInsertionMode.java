package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.jsoup.parser.HtmlTreeBuilder;
import org.mockito.Mockito;

public class GeneratedTest_markInsertionMode {

    private Document defaultSettings() {
        return Jsoup.parse("<html><body></body></html>");
    }

    @Test
    public void test_markInsertionMode() {
        Element element = new Element("p");
        boolean mode = true;
        builder.markInsertionMode(element, mode);
        assertTrue(element.hasAttr("data-markinsertionmode"));
    }

}