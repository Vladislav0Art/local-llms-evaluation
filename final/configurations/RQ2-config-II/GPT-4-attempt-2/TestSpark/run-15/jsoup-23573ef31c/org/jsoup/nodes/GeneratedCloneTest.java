package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        String baseUri = "http://www.website.com";
        Document doc = new Document(baseUri);
        Document clone = doc.clone();

        Assert.assertNotSame(doc, clone);
        Assert.assertEquals(doc.outerHtml(), clone.outerHtml());
    }

}