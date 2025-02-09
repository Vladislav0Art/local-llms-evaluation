package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValUnsupportedEncodingTest {

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws UnsupportedEncodingException, MalformedURLException {
        URL testUrl = new URL("http://example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value\uFFFF");
        urlBuilder.appendKeyVal(kv);
    }

}