package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValValidTest {

    @Test
    public void appendKeyValValidTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(kv);
        URL builtUrl = urlBuilder.build();

        Assert.assertEquals("http://example.com?key=value", builtUrl.toString());
    }

}