package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValUnsupportedEncodingExceptionTest {

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws MalformedURLException, UnsupportedEncodingException {
        URL testUrl = new URL("https://www.test.com");
        UrlBuilder builder = new UrlBuilder(testUrl);
        Connection.KeyVal keyVal = new Connection.KeyVal("testKey", "te\uFFFFst"); // non-UTF-8 character
        builder.appendKeyVal(keyVal);
    }

}