package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedOuterHtmlReturnsCorrectOuterHtml {

    @Test
    public void outerHtmlReturnsCorrectOuterHtml() {
        Document document = new Document("http://example.com");
        String expectedOuterHtml = "<html><body>Hello World!</body></html>";
        assertEquals(expectedOuterHtml, document.outerHtml());
    }

}