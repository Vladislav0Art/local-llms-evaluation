package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Parser parser = new Parser(builder);
        builder.parseFragment("<p>test</p>", null, "", parser);
        Elements elements = builder.getDocument().getElementsByTag("p");
        assertTrue(elements.size() > 0);
    }

}