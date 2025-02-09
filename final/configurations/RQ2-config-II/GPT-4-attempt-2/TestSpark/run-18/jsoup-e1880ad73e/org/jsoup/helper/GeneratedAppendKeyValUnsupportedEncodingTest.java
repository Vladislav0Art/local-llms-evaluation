package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValUnsupportedEncodingTest {

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        Connection.KeyVal kv = Connection.KeyVal.create("key", "\ud800\udc00");  // invalid Unicode surrogate pair
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(kv);
    }

}