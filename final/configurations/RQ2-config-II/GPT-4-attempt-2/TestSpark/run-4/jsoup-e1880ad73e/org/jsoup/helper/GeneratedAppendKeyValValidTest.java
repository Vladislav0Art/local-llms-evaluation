package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.net.UnsupportedEncodingException;

public class GeneratedAppendKeyValValidTest {

    @Test
    public void appendKeyValValidTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.google.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(Connection.KeyVal.create("key", "value"));
        URL actualUrl = builder.build();
        Assert.assertTrue(actualUrl.toString().contains("key=value"));
    }

}