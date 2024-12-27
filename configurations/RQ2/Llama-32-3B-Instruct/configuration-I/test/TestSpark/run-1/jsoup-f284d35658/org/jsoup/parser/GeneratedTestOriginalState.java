package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestOriginalState {

    @Test
    public void testOriginalState() throws Exception {
        Document document = Jsoup.parse("<html><body>Hello World!</body></html>");
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Object result = builder.originalState();
        assertNull(result);
    }

}