package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.jsoup.parser.HtmlTreeBuilder;

public class GeneratedTestProcessWithContext {

    @Test
    public void testProcessWithContext() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Element context = new Element("div", "header");
        String baseUri = "/test";
        Parser parser = new Parser();

        builder.process(context, builder.parseFragment("<p>Hello World!</p>", context, baseUri, parser));
    }

}