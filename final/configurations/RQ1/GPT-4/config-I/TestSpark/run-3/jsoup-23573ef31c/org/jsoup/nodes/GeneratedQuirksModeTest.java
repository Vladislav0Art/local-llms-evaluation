package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedQuirksModeTest {

    @Test
    public void quirksModeTest() {
        Document doc = new Document("http://www.example.com");
        doc.quirksMode(Document.QuirksMode.quirks);

        Assert.assertEquals(Document.QuirksMode.quirks, doc.quirksMode());
    }

}