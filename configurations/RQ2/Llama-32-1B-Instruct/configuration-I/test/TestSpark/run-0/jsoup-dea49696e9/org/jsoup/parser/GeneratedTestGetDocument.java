package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.jsoup.parser.HtmlTreeBuilder;

public class GeneratedTestGetDocument {

    @Test
    public void testGetDocument() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<html><body></body></html>");
        assertNotNull(document);
    }

}