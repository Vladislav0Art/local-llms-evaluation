package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedOuterHtmlBasicTest {

    @Test
    public void outerHtmlBasicTest() {
        Document document = new Document("http://example.com");
        String html = document.outerHtml();
        org.junit.Assert.assertEquals("", html);
    }

}