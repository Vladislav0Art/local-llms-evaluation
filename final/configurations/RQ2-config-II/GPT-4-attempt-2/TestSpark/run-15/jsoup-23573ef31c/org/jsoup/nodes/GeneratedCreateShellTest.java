package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class GeneratedCreateShellTest {

    @Test
    public void createShellTest() {
        String baseUri = "http://www.website.com";
        Document doc = Document.createShell(baseUri);
        Assert.assertNotNull(doc);
        Assert.assertEquals(baseUri, doc.location());
    }

}