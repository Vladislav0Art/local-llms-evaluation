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

public class GeneratedTitleTest {

    @Test
    public void titleTest() {
        Document doc = Jsoup.parse("<html><head><title>First parse</title></head><body><p>My body</p></body></html>", "http://example.com");
        Assert.assertEquals("First parse", doc.title());
    }

}