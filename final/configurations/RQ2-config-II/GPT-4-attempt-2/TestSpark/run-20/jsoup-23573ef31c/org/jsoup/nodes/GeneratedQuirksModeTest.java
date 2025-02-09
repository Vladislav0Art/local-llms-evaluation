package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedQuirksModeTest {

    @Test
    public void quirksModeTest() {
        Document document = new Document("http://example.com");
        document.quirksMode(QuirksMode.quirks);
        Assert.assertEquals(QuirksMode.quirks, document.quirksMode());
    }

}