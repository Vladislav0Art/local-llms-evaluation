package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.jsoup.parser.HtmlTreeBuilder;
import org.mockito.Mockito;

public class GeneratedTest_transition {

    private Document defaultSettings() {
        return Jsoup.parse("<html><body></body></html>");
    }

    @Test
    public void test_transition() {
        Element element = new Element("a");
        boolean transition = true;
        builder.transition(element, transition);
        assertTrue(element.hasAttr("data-markinsertionmode"));
    }

}