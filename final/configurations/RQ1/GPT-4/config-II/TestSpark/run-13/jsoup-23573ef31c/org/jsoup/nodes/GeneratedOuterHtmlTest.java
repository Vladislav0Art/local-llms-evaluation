package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.select.Selector;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTest {

    @Test
    public void outerHtmlTest() {
        Document doc = Jsoup.parse("<p>Example</p>");
        assertEquals("<html>\n <head></head>\n <body>\n  <p>Example</p>\n </body>\n</html>\n", doc.outerHtml());
    }

}