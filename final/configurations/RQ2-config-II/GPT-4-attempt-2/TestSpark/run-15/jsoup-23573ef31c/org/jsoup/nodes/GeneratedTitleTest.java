package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class GeneratedTitleTest {

    @Test
    public void titleTest() {
        String baseUri = "http://www.website.com";
        Document doc = new Document(baseUri);
        String title = "Website Title";
        doc.title(title);
        Assert.assertEquals(title, doc.title());
    }

}