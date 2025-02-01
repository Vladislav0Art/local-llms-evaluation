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

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        Document doc = Jsoup.parse("<html><head><title>First parse</title></head><body><form id=\"loginForm\"><input type=\"text\" name=\"username\" /></form></body></html>", "http://example.com");
        List<Element> forms = doc.forms();
        Assert.assertEquals(1, forms.size());
    }

}