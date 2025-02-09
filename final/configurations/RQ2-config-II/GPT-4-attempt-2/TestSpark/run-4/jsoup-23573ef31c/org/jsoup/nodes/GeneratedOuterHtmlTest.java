package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTest {

    @Test
    public void outerHtmlTest() {
        Document doc = new Document("http://example.com");
        String outerHtml = "<html><head></head><body></body></html>";
        assertEquals(outerHtml, doc.outerHtml());
    }

}