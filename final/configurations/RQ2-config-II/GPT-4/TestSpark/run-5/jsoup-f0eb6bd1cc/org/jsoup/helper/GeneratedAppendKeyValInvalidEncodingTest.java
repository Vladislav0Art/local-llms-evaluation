package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection.KeyVal;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValInvalidEncodingTest {

    @Test
    public void appendKeyValInvalidEncodingTest() throws UnsupportedEncodingException, MalformedURLException {
        URL url = new URL("http://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        KeyVal keyVal = KeyVal.create("key1", "\uD800\uDC00"); // surrogate pair
        urlBuilder.appendKeyVal(keyVal);
    }

}