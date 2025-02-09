package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlMethodTest {

    @Test
    public void outerHtmlMethodTest() {
        String html = "<html><body>Hello World!</body></html>";
        Document document = Jsoup.parse(html).documentElement();
        assertEquals(html, document.outerHtml());
    }

}