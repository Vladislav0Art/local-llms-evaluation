package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValValidEncodingTest {

    @Test
    public void appendKeyValValidEncodingTest() throws MalformedURLException, UnsupportedEncodingException {
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value", true);
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        urlBuilder.appendKeyVal(kv);

        URL expectedUrl = new URL("http://example.com?key=value");
        URL actualUrl = urlBuilder.build();

        Assert.assertEquals(expectedUrl, actualUrl);
    }

}