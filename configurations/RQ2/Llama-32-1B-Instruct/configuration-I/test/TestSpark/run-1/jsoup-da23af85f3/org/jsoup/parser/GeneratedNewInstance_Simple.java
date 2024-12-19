package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

public class GeneratedNewInstance_Simple {

    @Test
    public void newInstance_Simple() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Node node = builder.newInstance();
        assertEquals("HTML", node.tagName());
    }

}