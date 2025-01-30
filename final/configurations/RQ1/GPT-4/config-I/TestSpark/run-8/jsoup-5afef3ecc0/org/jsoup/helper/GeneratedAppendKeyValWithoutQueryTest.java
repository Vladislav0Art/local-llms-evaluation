package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class GeneratedAppendKeyValWithoutQueryTest {

    @Test
    public void appendKeyValWithoutQueryTest() throws Exception {
        URL url = new URL("https://www.example.com/path");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = Connection.KeyVal.create("param", "value");
        urlBuilder.appendKeyVal(kv);

        String expectedQuery = "param=" + URLEncoder.encode(kv.value(), StandardCharsets.UTF_8.name());
        // Assuming getter for the StringBuilder q in UrlBuilder
        String actualQuery = URLDecoder.decode(urlBuilder.getQuery(), StandardCharsets.UTF_8.name());
        Assert.assertEquals(expectedQuery, actualQuery);
    }

}