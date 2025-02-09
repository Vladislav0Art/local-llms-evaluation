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

public class GeneratedCreateElementTest {

    @Test
    public void createElementTest() {
        Document document = new Document("http://example.com");
        Element element = document.createElement("p");
        Assert.assertEquals("<p></p>", element.toString());
    }

}