package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;

public class GeneratedOuterHtmlReturnsCorrectOuterHTML {

    @Test
    public void outerHtmlReturnsCorrectOuterHTML() {
        String html = "<html><body>Hello World!</body></html>";
        Document doc = Jsoup.parse(html).documentElement();
        assertEquals(html, doc.outerHtml());
    }

}