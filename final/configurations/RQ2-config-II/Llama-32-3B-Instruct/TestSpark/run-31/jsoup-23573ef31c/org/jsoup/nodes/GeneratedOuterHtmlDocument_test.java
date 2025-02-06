package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedOuterHtmlDocument_test {

    @Test
    public void outerHtmlDocument_test() {
        String html = "<html><body>Hello World!</body></html>";
        Document document = Jsoup.parse(html).documentElement();
        String outerHtml = document.outerHtml();
        assertEquals(html, outerHtml);
    }

}