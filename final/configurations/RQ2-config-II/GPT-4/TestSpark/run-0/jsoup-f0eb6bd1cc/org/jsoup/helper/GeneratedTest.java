package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsx.internal.StringUtil;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    // assuming constructor and build method correctness will be ensured by other methods

    @Test
    public void appendKeyValNormalKVTest() {
        try {
            URL testUrl = new URL("http://test.com");
            UrlBuilder urlBuilder = new UrlBuilder(testUrl);
            Connection.KeyVal testKV = new Connection.KeyVal("test", "value");
            urlBuilder.appendKeyVal(testKV);
            URL resultUrl = urlBuilder.build();
            Assert.assertEquals("http://test.com?test=value", resultUrl.toString());
        } catch (MalformedURLException | UnsupportedEncodingException e) {
            Assert.fail();
        }
    }

    @Test
    public void appendKeyValNullKVTest() {
        try {
            URL testUrl = new URL("http://test.com");
            UrlBuilder urlBuilder = new UrlBuilder(testUrl);
            urlBuilder.appendKeyVal(null);
            URL resultUrl = urlBuilder.build();
            Assert.assertEquals("http://test.com", resultUrl.toString());
        } catch (MalformedURLException | UnsupportedEncodingException e) {
            Assert.fail();
        }
    }

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws UnsupportedEncodingException {
        URL testUrl = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        Connection.KeyVal testKV = new Connection.KeyVal("test", "\uD800"); //invalid unicode
        urlBuilder.appendKeyVal(testKV);
    }

    @Test
    public void appendKeyValEmptyStringTest() {
        try {
            URL testUrl = new URL("http://test.com");
            UrlBuilder urlBuilder = new UrlBuilder(testUrl);
            Connection.KeyVal testKV = new Connection.KeyVal("", "");
            urlBuilder.appendKeyVal(testKV);
            URL resultUrl = urlBuilder.build();
            Assert.assertEquals("http://test.com", resultUrl.toString());
        } catch (MalformedURLException | UnsupportedEncodingException e) {
            Assert.fail();
        }
    }

}