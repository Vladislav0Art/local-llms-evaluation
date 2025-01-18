package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedTitleTest {

    @Test
    public void titleTest() {
        Document doc = new Document("http://www.google.com");
        doc.title("Google");
        Assert.assertEquals("Google", doc.title());
    }

}