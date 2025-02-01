package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValWithoutQueryParameterTest {

    @Test
    public void appendKeyValWithoutQueryParameterTest() throws MalformedURLException, UnsupportedEncodingException {
        URL testUrl = new URL("http://www.example.com/");
        UrlBuilder builder = new UrlBuilder(testUrl);
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assertEquals("http://www.example.com/?key=value", builder.build().toString());
    }

}