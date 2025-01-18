package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedOuterHtmlTest {

    @Test
    public void outerHtmlTest() {
        Document doc = new Document("http://example.com");
        String expected = "<html>\n <head></head>\n <body></body>\n</html>";
        String outerHtml = doc.outerHtml();
        Assert.assertEquals(expected, outerHtml);
    }

}