package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedOuterHtmlReturnsCorrectOuterHtml {

    @Test
    public void outerHtmlReturnsCorrectOuterHtml() {
        String html = "<html><body>Hello World!</body></html>";
        Document document = Jsoup.parse(html);
        assertEquals(html, document.outerHtml());
    }

}