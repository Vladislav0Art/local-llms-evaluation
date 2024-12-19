package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.jsoup.parser.HtmlTreeBuilder;

public class GeneratedTestParseFragment {

    @Test
    public void testParseFragment() {
        Document document = Jsoup.parse("<p>Hello World!</p>");
        String inputFragment = "<p>Hello World!</p>";
        Element context = null;
        String baseUri = "/test";
        Parser parser = new Parser();

        List<Node> result = builder.parseFragment(inputFragment, context, baseUri, parser);
        assertNotNull(result);
    }

}