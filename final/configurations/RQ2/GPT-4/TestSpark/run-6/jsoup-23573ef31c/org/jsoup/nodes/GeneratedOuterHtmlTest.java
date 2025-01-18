package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedOuterHtmlTest {

    @Test
    public void outerHtmlTest() {
        Document doc = new Document("https://example.com");
        String outerHtml = doc.outerHtml();
        assertNotNull(outerHtml);
    }

}