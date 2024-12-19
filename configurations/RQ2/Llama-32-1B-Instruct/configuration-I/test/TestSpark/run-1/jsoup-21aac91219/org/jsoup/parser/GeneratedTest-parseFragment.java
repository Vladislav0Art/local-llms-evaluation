package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.jsoup.parser.HtmlTreeBuilder;
import org.mockito.Mockito;

public class GeneratedTest-

parseFragment {

    private Document defaultSettings () {
        return Jsoup.parse("<html><body></body></html>");
    }

    @Test
    public void test -parseFragment() {
        Element element = new Element("p");
        String fragment = "<p>This is a paragraph.</p>";
        Document doc = builder.parseFragment(element, fragment);
        assertEquals(element, doc.body().selectFirst("p"));
    }

}