package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetDocumentTest {

    @Test
    public void getDocumentTest() throws IOException {
        Document document = new HttpConnection().url("https://jsoup.org/").get();
        Assert.assertNotNull(document);
    }

}