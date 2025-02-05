package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.Charset;

public class GeneratedOuterHtmlTest {

    @Test
    public void outerHtmlTest() {
        String baseUri = "http://example.com";
        Document doc = new Document(baseUri);
        assertEquals("<html>\n <head></head>\n <body></body>\n</html>", doc.outerHtml());
    }

}