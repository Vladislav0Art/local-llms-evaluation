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

public class GeneratedCreateElementTest {

    @Test
    public void createElementTest() {
        Document doc = new Document("http://example.com");
        Element el = doc.createElement("div");
        Assert.assertEquals("div", el.nodeName());
    }

}