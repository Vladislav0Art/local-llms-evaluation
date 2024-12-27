package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestGetBaseUri {

    @Test
    public void testGetBaseUri() throws Exception {
        Document document = Jsoup.parse("<html><base uri=\"http://example.com\"/></html>");
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        String result = builder.getBaseUri();
        assertEquals("http://example.com", result);
    }

}