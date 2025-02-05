package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTest {

    @Test
    public void outerHtmlTest() {
        String html = "<html><head></head><body></body></html>";
        Document doc = new Document("http://example.com");
        assertEquals(html, doc.outerHtml().trim());
    }

}