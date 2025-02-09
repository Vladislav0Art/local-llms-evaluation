package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValUnsupportedEncodingExceptionTest {

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws UnsupportedEncodingException {
        URL url = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        KeyVal kv = KeyVal.create("key{}", "value{}");
        urlBuilder.appendKeyVal(kv);
    }

}