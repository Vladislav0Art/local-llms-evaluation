package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValValidKeyValTest {

    @Test
    public void appendKeyValValidKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal validKeyVal = new Connection.KeyVal("foo", "bar");
        urlBuilder.appendKeyVal(validKeyVal);
        assertEquals("http://example.com?foo=bar", urlBuilder.build().toString());
    }

}