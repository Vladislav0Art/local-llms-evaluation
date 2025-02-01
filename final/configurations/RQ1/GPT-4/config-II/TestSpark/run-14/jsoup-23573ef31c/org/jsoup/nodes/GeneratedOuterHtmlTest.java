package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTest {

    @Test
    public void outerHtmlTest() {
        Document doc = Jsoup.parse("<div>test</div>");
        assertEquals("<html>\n <head></head>\n <body>\n  <div>test</div>\n </body>\n</html>", doc.outerHtml());
    }

}