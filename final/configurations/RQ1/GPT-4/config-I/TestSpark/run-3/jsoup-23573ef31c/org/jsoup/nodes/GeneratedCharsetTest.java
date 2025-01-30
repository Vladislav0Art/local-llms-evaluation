package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document doc = new Document("http://www.example.com");
        doc.charset(java.nio.charset.StandardCharsets.ISO_8859_1);

        Assert.assertEquals(java.nio.charset.StandardCharsets.ISO_8859_1, doc.charset());
    }

}