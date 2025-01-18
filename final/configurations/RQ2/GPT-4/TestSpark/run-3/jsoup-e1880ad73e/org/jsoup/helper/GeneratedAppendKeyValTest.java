package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL testUrl = new URL("https://www.test.com");
        UrlBuilder builder = new UrlBuilder(testUrl);
        Connection.KeyVal keyVal = Connection.KeyVal.create("testKey", "testValue");
        builder.appendKeyVal(keyVal);
        URL builtUrl = builder.build();
        Assert.assertTrue(builtUrl.toString().contains("testKey=testValue"));
    }

}