package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.HttpCookie;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetTest {

    @Test
    public void getTest() throws IOException {
        Document doc = Jsoup.connect("http://www.google.com").get();
        Assert.assertNotNull(doc.title());
    }

}