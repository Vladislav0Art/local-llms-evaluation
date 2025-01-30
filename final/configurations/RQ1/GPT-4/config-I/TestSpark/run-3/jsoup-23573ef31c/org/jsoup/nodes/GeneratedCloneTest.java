package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Document doc = new Document("http://www.example.com");
        Document docClone = doc.clone();

        Assert.assertEquals(doc.outerHtml(), docClone.outerHtml());
    }

}