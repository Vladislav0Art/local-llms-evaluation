package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValWithQueryParameterTest {

    @Test
    public void appendKeyValWithQueryParameterTest() throws MalformedURLException, UnsupportedEncodingException {
        URL testUrl = new URL("http://www.example.com/?query=test");
        UrlBuilder builder = new UrlBuilder(testUrl);
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assertEquals("http://www.example.com/?query=test&key=value", builder.build().toString());
    }

}