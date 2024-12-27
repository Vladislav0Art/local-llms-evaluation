package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestParseFragment {

    @Test
    public void testParseFragment() throws Exception {
        Document document = Jsoup.parse("<html><body>Hello World!</body></html>");
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        List<Node> result = builder.parseFragment("", null, null, null);
        assertTrue(result.isEmpty());
    }

}