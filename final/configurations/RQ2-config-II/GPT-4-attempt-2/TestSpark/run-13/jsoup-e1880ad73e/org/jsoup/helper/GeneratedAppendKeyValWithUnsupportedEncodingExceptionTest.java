package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValWithUnsupportedEncodingExceptionTest {

    @Test
    public void appendKeyValWithUnsupportedEncodingExceptionTest() throws UnsupportedEncodingException {
        URL url = null;
        try {
            url = new URL("http://www.example.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        UrlBuilder builder = new UrlBuilder(url);
        String key = "key";
        String value = "\uD800";
        Connection.KeyVal keyValue = Connection.KeyVal.create(key, value);
        builder.appendKeyVal(keyValue);
    }

}