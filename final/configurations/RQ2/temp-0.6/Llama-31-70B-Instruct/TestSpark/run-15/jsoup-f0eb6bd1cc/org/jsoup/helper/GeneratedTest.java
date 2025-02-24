package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedTest {

    @Test
    public void buildTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();
        assertEquals("http://www.example.com/", builtUrl.toString());
    }

    @Test
    public void buildTest_MalformedUrl() throws MalformedURLException {
        URL inputUrl = new URL("malformed_url");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.build();
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value", false);
        urlBuilder.appendKeyVal(kv);
        assertEquals("key=value", urlBuilder.query().toString());
    }

    @Test
    public void appendKeyValTest_UnsupportedEncodingException() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value", false);
        urlBuilder.appendKeyVal(kv);
        DataUtil.UTF_8 = null;
        urlBuilder.appendKeyVal(kv);
    }

}