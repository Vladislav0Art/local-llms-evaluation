package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValInvalidEncodingTest {

    // UrlBuilder instance creation test

    @Test
    public void appendKeyValInvalidEncodingTest() throws MalformedURLException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.google.com"));
        Connection.KeyVal kv = new Connection.KeyVal("\u1111", "value");
        urlBuilder.appendKeyVal(kv);
    }

}