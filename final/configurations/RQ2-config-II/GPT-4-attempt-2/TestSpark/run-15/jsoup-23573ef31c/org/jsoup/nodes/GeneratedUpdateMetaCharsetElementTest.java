package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class GeneratedUpdateMetaCharsetElementTest {

    @Test
    public void updateMetaCharsetElementTest() {
        String baseUri = "http://www.website.com";
        Document doc = new Document(baseUri);

        doc.charset(StandardCharsets.UTF_16);
        doc.updateMetaCharsetElement(true);

        Assert.assertTrue(doc.updateMetaCharsetElement());
    }

}