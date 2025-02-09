package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        String baseUri = "http://www.website.com";
        Document doc = new Document(baseUri);
        Assert.assertEquals("#document", doc.nodeName());
    }

}