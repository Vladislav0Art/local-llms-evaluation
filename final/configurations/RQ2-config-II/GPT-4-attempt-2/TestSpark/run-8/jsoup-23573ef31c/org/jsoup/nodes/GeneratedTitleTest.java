package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
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
        Document doc = new Document("https://www.example.com");
        doc.title("Test Title");
        Assert.assertEquals("Test Title", doc.title());
    }

}