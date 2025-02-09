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

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document document = new Document("http://example.com");
        document.charset(StandardCharsets.UTF_8);
        Assert.assertEquals(StandardCharsets.UTF_8, document.charset());
    }

}