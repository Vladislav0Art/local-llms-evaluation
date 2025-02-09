package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        String baseUri = "http://www.website.com";
        Document doc = new Document(baseUri);

        Charset charset = StandardCharsets.US_ASCII;
        doc.charset(charset);

        Assert.assertEquals(charset, doc.charset());
    }

}