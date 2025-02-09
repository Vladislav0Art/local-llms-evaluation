package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValValidKeyValTest {

    @Test
    public void appendKeyValValidKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        builder.appendKeyVal(kv);
        URL appendedUrl = builder.build();
        Assert.assertNotNull(appendedUrl);
        Assert.assertEquals("https://www.example.com?key=value", appendedUrl);
    }

}