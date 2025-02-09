package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() {
        URL testUrl = null;
        try {
            testUrl = new URL("http://test.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        Assert.assertNotNull(urlBuilder);
    }

    @Test
    public void buildTest() {
        URL testUrl = null;
        try {
            testUrl = new URL("http://test.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        URL resultUrl = urlBuilder.build();
        Assert.assertEquals(testUrl, resultUrl);
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL testUrl = null;
        try {
            testUrl = new URL("http://test.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(kv);
        URL resultUrl = urlBuilder.build();
        Assert.assertEquals("http://test.com?key=value", resultUrl.toString());
    }

}