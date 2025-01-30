package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedDocumentCreationTest {

    @Test
    public void DocumentCreationTest() {
        Document doc = new Document("http://www.example.com");

        // Default Parser
        Assert.assertEquals(Parser.htmlParser().getClass(), doc.parser().getClass());

        // location
        Assert.assertEquals("http://www.example.com", doc.location());
    }

}