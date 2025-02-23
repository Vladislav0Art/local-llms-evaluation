package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedTest {

    @Test
    public void buildTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        Assert.assertEquals("http://www.example.com/", outputUrl.toString());
    }

    @Test
    public void buildTestMalformedURLException() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "value1"));
        Assert.assertEquals("key1=value1", urlBuilder.q.toString());
    }

    @Test
    public void appendKeyValTestUnsupportedEncodingException() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "value1"));
    }

}