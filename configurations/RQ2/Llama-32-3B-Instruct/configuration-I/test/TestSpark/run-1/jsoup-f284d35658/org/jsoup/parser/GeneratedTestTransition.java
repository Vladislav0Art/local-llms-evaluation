package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestTransition {

    @Test
    public void testTransition() throws Exception {
        Document document = Jsoup.parse("<html><body>Hello World!</body></html>");
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Object result = builder.transition(new Object());
        assertNull(result);
    }

}