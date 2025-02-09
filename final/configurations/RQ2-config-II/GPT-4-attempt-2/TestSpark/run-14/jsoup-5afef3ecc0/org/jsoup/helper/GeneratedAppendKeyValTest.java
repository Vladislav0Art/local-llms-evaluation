package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = Connection.KeyVal.create("testKey", "testValue");

        urlBuilder.appendKeyVal(keyVal);

        URL expectedUrl = new URL("http://example.com?testKey=testValue");
        URL resultUrl = urlBuilder.build();

        assertEquals(expectedUrl, resultUrl);
    }

}