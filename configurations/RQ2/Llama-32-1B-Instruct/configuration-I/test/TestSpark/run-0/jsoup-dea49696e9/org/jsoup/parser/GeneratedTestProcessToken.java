package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.jsoup.parser.HtmlTreeBuilder;

public class GeneratedTestProcessToken {

    @Test
    public void testProcessToken() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Token token = null;
        builder.process(token);

        String expected = "<p>Hello World!</p>";
        assertEquals(expected, token.getText());
    }

}