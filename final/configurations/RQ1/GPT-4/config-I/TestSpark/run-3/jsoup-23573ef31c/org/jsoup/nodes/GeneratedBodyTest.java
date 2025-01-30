package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedBodyTest {

    @Test
    public void bodyTest() {
        Document doc = new Document("http://www.example.com");
        Element body = doc.body();

        Assert.assertEquals("body", body.nodeName());
    }

}