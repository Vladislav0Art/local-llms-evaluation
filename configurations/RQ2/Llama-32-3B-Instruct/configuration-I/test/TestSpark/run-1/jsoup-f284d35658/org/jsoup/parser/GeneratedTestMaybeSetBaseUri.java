package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestMaybeSetBaseUri {

    @Test
    public void testMaybeSetBaseUri() throws Exception {
        Document document = Jsoup.parse("<html><base uri=\"http://example.com\"/></html>");
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        assertFalse(builder.maybeSetBaseUri(null));
    }

}