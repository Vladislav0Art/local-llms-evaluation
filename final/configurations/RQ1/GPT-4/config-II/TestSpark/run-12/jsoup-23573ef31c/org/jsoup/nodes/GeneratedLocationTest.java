package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedLocationTest {

    @Test
    public void locationTest() {
        Document doc = new Document("http://example.com");
        Assert.assertEquals("http://example.com", doc.location());
    }

}