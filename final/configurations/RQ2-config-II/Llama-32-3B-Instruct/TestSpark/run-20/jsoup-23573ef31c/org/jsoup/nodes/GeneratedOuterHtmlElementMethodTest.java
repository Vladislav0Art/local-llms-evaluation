package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedOuterHtmlElementMethodTest {

    @Test
    public void outerHtmlElementMethodTest() {
        Document document = new Document("http://example.com");
        String html = document.outerHtml();
        assertTrue(html.isEmpty());
    }

}