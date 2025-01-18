package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedCharsetReadWriteTest {

    @Test
    public void charsetReadWriteTest() {
        Document doc = new Document("http://example.com");
        doc.charset(Charset.forName("UTF-8"));
        Assert.assertEquals(Charset.forName("UTF-8"), doc.charset());
    }

}