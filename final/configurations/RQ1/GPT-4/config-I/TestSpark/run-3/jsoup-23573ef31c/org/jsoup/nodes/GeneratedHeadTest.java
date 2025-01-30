package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedHeadTest {

    @Test
    public void headTest() {
        Document doc = new Document("http://www.example.com");
        Element head = doc.head();

        Assert.assertEquals("head", head.nodeName());
    }

}