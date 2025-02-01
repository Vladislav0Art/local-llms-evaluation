package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedConstructorWithQueryParameterTest {

    @Test
    public void constructorWithQueryParameterTest() throws MalformedURLException {
        URL testUrl = new URL("http://www.example.com/?query=test");
        UrlBuilder builder = new UrlBuilder(testUrl);
        assertEquals("http://www.example.com/?query=test", builder.build().toString());
    }

}