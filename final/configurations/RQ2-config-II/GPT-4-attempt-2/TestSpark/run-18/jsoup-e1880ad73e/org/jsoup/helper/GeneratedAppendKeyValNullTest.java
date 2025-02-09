package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValNullTest {

    @Test
    public void appendKeyValNullTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        Connection.KeyVal kv = null;
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(kv);
    }

}