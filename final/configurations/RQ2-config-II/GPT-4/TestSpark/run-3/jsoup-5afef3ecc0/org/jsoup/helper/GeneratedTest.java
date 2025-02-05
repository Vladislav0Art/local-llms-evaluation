package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    @Test
    public void UrlBuilderTest_ValidUrl() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Assert.assertNotNull(urlBuilder);
    }

    @Test
    public void UrlBuilderTest_NullUrl() {
        URL inputUrl = null;
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void buildTest_BuilderWithValidUrl() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();
        Assert.assertEquals(inputUrl, resultUrl);
    }

    @Test
    public void buildTest_BuilderWithNullUrl() {
        URL inputUrl = null;
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();
    }

    @Test
    public void appendKeyValTest_ValidKeyVal() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value");
        urlBuilder.appendKeyVal(kv);
        URL resultUrl = urlBuilder.build();
        Assert.assertEquals("http://www.example.com?key=value", resultUrl.toString());
    }

    @Test
    public void appendKeyValTest_UnsupportedEncoding() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Connection.KeyVal.create("key", "\uFFFF");
        urlBuilder.appendKeyVal(kv);
    }

}