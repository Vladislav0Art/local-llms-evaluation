package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValUnsupportedEncodingTest {

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = Connection.KeyVal.create("testKey", "电脑");

        urlBuilder.appendKeyVal(keyVal);
    }

}