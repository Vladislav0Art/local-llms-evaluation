package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedAppendKeyValWithUnsupportedEncodingTest {

    @Test
    public void appendKeyValWithUnsupportedEncodingTest() throws UnsupportedEncodingException {
        URL inputUrl = null;
        try {
            inputUrl = new URL("https://www.example.com");
        } catch (MalformedURLException e) {
            Assert.fail("Test failed with exception: " + e.getMessage());
        }
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Connection.KeyVal.create("key", "\uD800");
        urlBuilder.appendKeyVal(kv);
    }

}