package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void buildTest() throws MalformedURLException {
        URL inputUrl = new URL("https://www.example.com/");
        UrlBuilder builder = new UrlBuilder(inputUrl);

        URL outputUrl = builder.build();

        assertEquals("https://www.example.com/", outputUrl.toString());
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.example.com/");
        UrlBuilder builder = new UrlBuilder(inputUrl);

        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        builder.appendKeyVal(kv);

        assertEquals("key=value", builder.q.toString());
    }

}