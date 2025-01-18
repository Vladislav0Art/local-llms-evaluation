package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedTitleReadWriteTest {

    @Test
    public void titleReadWriteTest() {
        Document doc = new Document("http://example.com");
        doc.title("TestTitle");
        Assert.assertEquals("TestTitle", doc.title());
    }

}