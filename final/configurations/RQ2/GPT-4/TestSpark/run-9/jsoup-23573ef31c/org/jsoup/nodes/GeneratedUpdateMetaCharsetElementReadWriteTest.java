package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedUpdateMetaCharsetElementReadWriteTest {

    @Test
    public void updateMetaCharsetElementReadWriteTest() {
        Document doc = new Document("http://example.com");
        doc.updateMetaCharsetElement(true);
        Assert.assertTrue(doc.updateMetaCharsetElement());
    }

}