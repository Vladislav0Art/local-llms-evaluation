package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Document doc1 = new Document("http://example.com");
        Document doc2 = doc1.clone();
        Assert.assertNotSame(doc1, doc2);
        Assert.assertEquals(doc1.outerHtml(), doc2.outerHtml());
    }

}