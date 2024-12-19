package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GeneratedTestInsertToken {

    @Test
    public void testInsertToken() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Element element = null;
        builder.insert(element);

        String expected = "<p>Hello World!</p>";
        assertEquals(expected, element.getText());
    }

}